package org.launchcode;

import java.time.LocalDate;

public class MenuItem {
    private String name;
    private double price;
    private String description;
    private String category;
    private boolean isNew;

    public MenuItem(String name, String description, double price, String category, boolean iN) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.category = category;
        this.isNew = iN;
    }

    public MenuItem(String name, String description, double price, String category) {
        this(name,description,price,category,false);
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setNew(boolean aNew) {
        isNew = aNew;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }

    public String getCategory() {
        return category;
    }

    public boolean isNew() {
        return isNew;
    }

    @Override
    public String toString() {
        String itemStatus = isNew() ? "- newly added!" : "";
        return   name + '\t' + itemStatus + "\t\t\t" +
                "$ " +price;
    }

    @Override
    public boolean equals(Object menuItemToCheck) {
        if (menuItemToCheck == this) return true;
        if (menuItemToCheck == null) return false;
        if (menuItemToCheck.getClass() != getClass()) return false;

        MenuItem item = (MenuItem) menuItemToCheck;
        return item.name.equals(name);
    }
}

