package com.youssefelabd.json;

/**
 * Created by youssefelabd on 12/9/16.
 */
public class Dinner
{
    private Items[] Items;

    private String Name;

    public Items[] getItems ()
    {
        return Items;
    }

    public void setItems (Items[] Items)
    {
        this.Items = Items;
    }

    public String getName ()
    {
        return Name;
    }

    public void setName (String Name)
    {
        this.Name = Name;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [Items = "+Items+", Name = "+Name+"]";
    }
}