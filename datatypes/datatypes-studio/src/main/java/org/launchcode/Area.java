package org.launchcode;

import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double radius;
        // Basic Solution
         /* System.out.println("Please, enter a radius: ");
        radius = input.nextDouble();
        Double areaOfCircle = Circle.getArea(radius);
        System.out.println("The area of the circle of radius " + radius + " is: " + areaOfCircle);
        */

        // Bonus Mission 1
        System.out.println("Please, enter a radius: ");
        if(input.hasNextDouble()){
            radius = input.nextDouble();

            if(radius > 0 ){
                Double areaOfCircle = Circle.getArea(radius);
                System.out.println("The area of the circle of radius " + radius + " is: " + areaOfCircle);
            }else {
                System.out.println("Sorry, the radius must be a positive number");
            }
        } else {
            System.out.println("Please enter a valid number");
            System.exit(0);
        }

    }


}
