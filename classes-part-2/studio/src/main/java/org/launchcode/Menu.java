package org.launchcode;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;

public class Menu {
    private LocalDate lastUpdated;
    private ArrayList<MenuItem> items = new ArrayList<>();

    public ArrayList<MenuItem> getItems() {
        return items;
    }

    void addMenuItem(MenuItem item){
        if(items.contains(item)){
            System.out.println("This item is already been added to the menu.");
            return;
        }
        items.add(item);
        lastUpdated = LocalDate.now();
    }

    void removeMenuItem(MenuItem item){
        items.remove(item);
        lastUpdated = LocalDate.now();
    }

    @Override
    public String toString() {
        StringBuilder appetizersList = new StringBuilder();
        StringBuilder mainCourseList = new StringBuilder();
        StringBuilder dessertsList = new StringBuilder();
        for(MenuItem item :  items){
            if(item.getCategory().equals("Appetizers")){
                appetizersList.append(item.toString()).append("\n");
            }else if(item.getCategory().equals("Main course")){
                mainCourseList.append(item.toString()).append("\n");
            }else {
                dessertsList.append(item.toString()).append("\n");
            }
        }
        return "FOOD MENU" + "\n\n" +  "Main course : \n" + mainCourseList +
                "Appetizers : \n" + appetizersList +
                "Desserts : \n" + dessertsList;
    }
}


