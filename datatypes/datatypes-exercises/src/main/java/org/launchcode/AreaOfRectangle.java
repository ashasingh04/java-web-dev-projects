package org.launchcode;

import java.util.Scanner;

public class AreaOfRectangle {
    public  static  void main(String[] args){
        int len;
        int width;
        int areaOfRectangle;

        Scanner input = new Scanner(System.in);
        System.out.println("Please, enter the length of the rectangle: ");
        len = input.nextInt();
        System.out.println("Please, enter width of the rectangle: ");
        width = input.nextInt();
        input.close();
        areaOfRectangle = len * width;
        System.out.println("Area of the Rectangle is: " + areaOfRectangle);

    }
}
