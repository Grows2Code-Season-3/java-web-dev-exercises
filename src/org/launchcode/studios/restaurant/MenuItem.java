package org.launchcode.studios.restaurant;

public class MenuItem {

    private double price;
    private String description;
    private String category;
    private boolean isNew = true;

    public MenuItem (double price, String description, String category) {
        this.price = price;
        this.description = description;
        this.category = category;
    }

    public double getPrice() {
        return this.price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public boolean isNew() {
        return isNew;
    }

    public void setNew(boolean aNew) {
        isNew = aNew;
    }
}
