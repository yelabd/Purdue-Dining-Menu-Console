package com.youssefelabd.json;

import com.google.gson.Gson;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

import javax.swing.*;
import java.io.IOException;
import java.util.Scanner;

/**
 * Created by youssefelabd on 12/9/16.
 */
public class MainConsole {
    private static OkHttpClient client = new OkHttpClient();
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLUE = "\u001B[34m";
    static final String[] diningCourts = {"Wiley","Windsor","Ford","Hillenbrand","Earhart"};
    static final String[] meals = {"Dinner","Breakfast","Lunch"};
    static String finalChoice,finalMeal,finalDate;

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("\u001B[37;1mEnter a dining court: ");
        String diningCourtInput = scan.nextLine();
        courtChecker(diningCourtInput);

        System.out.println("\u001B[37;1mEnter a date (mm-dd-yy): ");
        String dateInput = scan.nextLine();
        dataChecker(dateInput);

        System.out.println("\u001B[37;1mEnter a meal: ");
        String meal = scan.nextLine();
        mealChecker(meal);

        DiningAPI diningAPI = getUserData(finalChoice, dateInput);

        if (finalMeal.equals("Dinner")) {
            try {
                Dinner[] dinners = diningAPI.getDinner();
                System.out.println("\u001B[36;1m"+finalChoice+" "+finalMeal+" Menu");
                for (int i = 0; i < dinners.length; i++) {
                    System.out.println("\u001B[33;1mDinner: " + dinners[i].getName() + ANSI_RESET);
                    Items[] itemss = dinners[i].getItems();
                    for (int j = 0; j < itemss.length; j++) {
                        System.out.println(ANSI_BLUE + itemss[j].getName() + ANSI_RESET);
                    }
                }
            }catch (Exception e){
                System.err.println("An issue occurred with your request");
            }


        }else if (finalMeal.equals("Breakfast")){
            try {
                Breakfast[] breakfasts = diningAPI.getBreakfast();
                System.out.println("\u001B[36;1m"+finalChoice+" "+finalMeal+" Menu");
                for (int i = 0; i < breakfasts.length; i++) {
                    System.out.println("\u001B[33;1mBreakfast: " + breakfasts[i].getName() + ANSI_RESET);
                    Items[] itemss = breakfasts[i].getItems();
                    for (int j = 0; j < itemss.length; j++) {
                        System.out.println(ANSI_BLUE + itemss[j].getName() + ANSI_RESET);
                    }
                }
            }catch (Exception e){
                System.err.println("An issue occurred with your request");
            }

        }else {
            try {
                Lunch[] lunches = diningAPI.getLunch();
                System.out.println("\u001B[36;1m"+finalChoice+" "+finalMeal+" Menu");
                for (int i = 0; i < lunches.length; i++) {
                    System.out.println("\u001B[33;1mLunch: " + lunches[i].getName() + ANSI_RESET);
                    Items[] itemss = lunches[i].getItems();
                    for (int j = 0; j < itemss.length; j++) {
                        System.out.println(ANSI_BLUE + itemss[j].getName() + ANSI_RESET);
                    }
                }
            }catch (Exception e){
                System.err.println("An issue occurred with your request");
            }

        }

    }
    public static String getJSON(String url) throws IOException {
        Request request = new Request.Builder().url(url).build();

        //request.header("json");

        Response response = client.newCall(request).execute();
        return response.body().string();
    }

    public static DiningAPI getUserData(String diningCourt, String date){
        String json = "";

        try {
            json = getJSON("http://api.hfs.purdue.edu/menus/v1/locations/"+diningCourt+"/"+date+"/");
        }catch (IOException e){

            e.printStackTrace();
        }
        //System.out.println(json);

        Gson gson = new Gson();

        DiningAPI diningAPI = gson.fromJson(json,DiningAPI.class);

        return diningAPI;

        //return new String[]{"Desc: " + diningAPI.getDescription(),"Name: " + diningAPI.getName(),"ID: "+diningAPI.getId(),"Owner: "+ diningAPI.getOwner()};
    }
    public static void courtChecker(String court){
        String formatted = formatter(court);
        boolean match = false;

        for (String diningCourt1 : diningCourts) {
            if (formatted.equals(diningCourt1)) {
                match = true;
                finalChoice = formatted;
                break;
            }
        }
        Scanner scan = new Scanner(System.in);
        while (!match) {
            System.out.println("\u001B[31;1mYour entry is not valid.Plese re-enter a dining court or exit by typing 'QUIT':");
            String trial = scan.nextLine();

            if (trial.equalsIgnoreCase("QUIT")) {
                System.exit(0);
            } else {
                for (String diningCourt : diningCourts) {
                    if (diningCourt.equals(trial)) {
                        match = true;
                        finalChoice = formatted;
                        break;
                    }
                }
            }
        }
    }

    public static void dataChecker(String date){
        String trial = date;
        Scanner scan = new Scanner(System.in);
        boolean correct = false;

        while (!correct){
            if(trial.split("-").length != 3) {
                System.out.println("\u001B[31;1mYour entry is not valid.Plese re-enter a date or exit by typing 'QUIT':");
                trial = scan.nextLine();
            }else {
                String[] split = trial.split("-");
                boolean splitLength = true;
                for(String seperate : split){
                    if (seperate.length() != 2){
                        splitLength = false;
                        System.out.println("\u001B[31;1mYour entry is not valid.Plese re-enter a date or exit by typing 'QUIT':");
                        trial = scan.nextLine();
                        break;
                    }

                }
                if (splitLength){
                    correct = true;
                    finalDate = trial;
                }
            }
        }
    }
    public static void mealChecker(String meal){
        String formatted = formatter(meal);
        boolean match = false;

        for (String diningCourt1 : meals) {
            if (formatted.equals(diningCourt1)) {
                match = true;
                finalMeal = formatted;
                break;
            }
        }
        Scanner scan = new Scanner(System.in);
        while (!match) {
            System.out.println("\u001B[31;1mYour entry is not valid.Plese re-enter a meal or exit by typing 'QUIT':");
            String trial = scan.nextLine();

            if (trial.equalsIgnoreCase("QUIT")) {
                System.exit(0);
            } else {
                for (String diningCourt : meals) {
                    if (diningCourt.equals(trial)) {
                        match = true;
                        finalMeal = formatted;
                        break;
                    }
                }
            }
        }
    }
    public static String formatter(String court){
        String first = court.substring(0,1);
        String rest = court.substring(1);

        return first.toUpperCase() + rest.toLowerCase();
    }
}
