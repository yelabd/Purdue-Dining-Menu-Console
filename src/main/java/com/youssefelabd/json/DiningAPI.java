package com.youssefelabd.json;

/**
 * Created by youssefelabd on 12/7/16.
 */
public class DiningAPI
{
    private Dinner[] Dinner;

    private Breakfast[] Breakfast;

    private Lunch[] Lunch;

    public Dinner[] getDinner ()
    {
        return Dinner;
    }

    public void setDinner (Dinner[] Dinner)
    {
        this.Dinner = Dinner;
    }

    public Breakfast[] getBreakfast ()
    {
        return Breakfast;
    }

    public void setBreakfast (Breakfast[] Breakfast)
    {
        this.Breakfast = Breakfast;
    }

    public Lunch[] getLunch ()
    {
        return Lunch;
    }

    public void setLunch (Lunch[] Lunch)
    {
        this.Lunch = Lunch;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [Dinner = "+Dinner+", Breakfast = "+Breakfast+", Lunch = "+Lunch+"]";
    }
}