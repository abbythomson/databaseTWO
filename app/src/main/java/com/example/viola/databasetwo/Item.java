package com.example.viola.databasetwo;

/**
 * Created by viola on 12/5/2016.
 */

public class Item {
    private String title;

    public Item(){}

    public Item(String title){
        this.title=title;
    }

    public String getTitle(){
        return title;
    }

    public void setTitle(String title){
        this.title = title;
    }
}
