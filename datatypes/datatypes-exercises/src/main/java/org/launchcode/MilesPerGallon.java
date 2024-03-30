package org.launchcode;
import java.util.Scanner;

public class MilesPerGallon {
    public  static  void main(String[] args){
    Scanner input = new Scanner(System.in);

    System.out.println("How many miles, you have driven? ");
    double numOfMiles = input.nextDouble();

    System.out.println("Amount of gas(in Gallon), you have consumed ? ");
    double amtOfGas = input.nextDouble();
    input.close();

    double mpg = numOfMiles / amtOfGas;
    System.out.println("You are running on " + mpg + " mpg.");
    }
}
