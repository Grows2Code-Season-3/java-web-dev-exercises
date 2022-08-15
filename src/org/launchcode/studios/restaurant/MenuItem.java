package org.launchcode.studios.restaurant;

import java.util.Objects;

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

    @Override
    public String toString() {
        String itemStr = this.description + " - $" + this.price + " (" + this.category + ")";

        if (this.isNew) {
            itemStr += " (NEW!)";
        }

        return itemStr;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MenuItem menuItem = (MenuItem) o;
        return Double.compare(menuItem.price, price) == 0 && Objects.equals(description, menuItem.description) && Objects.equals(category, menuItem.category);
    }

    @Override
    public int hashCode() {
        return Objects.hash(price, description, category);
    }
}
