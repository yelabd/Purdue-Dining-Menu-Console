package com.youssefelabd.json;

/**
 * Created by youssefelabd on 12/9/16.
 */
public class Items
{
    private String Name;

    private String IsVegetarian;

    public String getName ()
    {
        return Name;
    }

    public void setName (String Name)
    {
        this.Name = Name;
    }

    public String getIsVegetarian ()
    {
        return IsVegetarian;
    }

    public void setIsVegetarian (String IsVegetarian)
    {
        this.IsVegetarian = IsVegetarian;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [Name = "+Name+", IsVegetarian = "+IsVegetarian+"]";
    }
}