package com.example.kamal.attendanceapp.models;

/**
 * Created by Kamal on 07-03-2017.
 */

public class DrawerItem {
    private String itemName;
    private int imageResId;

    public DrawerItem(String name, int icon) {
        this.itemName = name;
        this.imageResId = icon;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }
}
