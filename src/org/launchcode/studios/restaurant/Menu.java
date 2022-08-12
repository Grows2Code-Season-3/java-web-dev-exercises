package org.launchcode.studios.restaurant;

import java.util.ArrayList;
import java.util.Date;

public class Menu {

    private ArrayList<MenuItem> items = new ArrayList<>();
    private Date lastUpdated;

    public Menu () {}

    public void addItem(MenuItem newItem) {
        this.items.add(newItem);
        this.lastUpdated = new Date();
    }

    public void removeItem(MenuItem item) {
        this.items.remove(item);
    }

    public ArrayList<MenuItem> getItems() {
        return items;
    }

    public Date getLastUpdated() {
        return lastUpdated;
    }
}
