package org.launchcode;

import java.time.LocalDate;
import java.util.ArrayList;

public class Menu {
    private  ArrayList<MenuItem> menuItems;
    private LocalDate lastupdated;

    public Menu(ArrayList<MenuItem> menuItems, LocalDate lastupdated) {
        this.menuItems = menuItems;
        this.lastupdated = lastupdated;
    }

    public ArrayList<MenuItem> getMenuItems(){
        return menuItems;
    }

    public LocalDate getLastupdated() {
        return lastupdated;
    }

    public void setMenuItems(ArrayList<MenuItem> menuItems) {
        this.menuItems = menuItems;
    }

    public void setLastupdated(LocalDate lastupdated) {
        this.lastupdated = lastupdated;
    }
}
