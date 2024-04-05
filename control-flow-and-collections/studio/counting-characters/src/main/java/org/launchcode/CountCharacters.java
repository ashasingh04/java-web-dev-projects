package org.launchcode;
import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.util.HashMap;
import java.util.Scanner;

public class CountCharacters {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
/*
        String phrase = "If the product of two terms is zero then common sense says at" +
                " least one of the two terms has to be zero to start with. So if you" +
                " move all the terms over to one side, you can put the quadratics into " +
                "a form that can be factored allowing that side of the equation to equal" +
                " zero. Once you’ve done that, it’s pretty straightforward from there.";

        char[] charactersInString = phrase.toCharArray();
        HashMap<Character,Integer> charCount = GetCount.getCharCount(charactersInString);
        charCount.forEach((key,value) ->{
            System.out.println(key + ": " + value);
        });

 */
        //BONUS MISSION
/*
        System.out.println("Please enter a phrase : ");
        String phrase = input.nextLine().replaceAll("[^a-zA-Z]", "").toLowerCase();
        char[] charactersInString = phrase.toCharArray();
        HashMap<Character,Integer> charCount = GetCount.getCharCount(charactersInString);
        charCount.forEach((key,value) ->{
            System.out.println(key + ": " + value);
        });

 */

        // SUPER BONUS
        Path fileName = Path.of("C:\\LaunchCode\\Unit-2\\java-web-dev-projects\\control-flow-and-collections\\studio\\counting-characters\\src\\main\\java\\org\\launchcode\\phrase.txt");
        String content = new Scanner(fileName).useDelimiter("\\Z").next().replaceAll("[^a-zA-Z]", "").toLowerCase();
        //System.out.println(content);
        char[] charactersInString = content.toCharArray();
        HashMap<Character,Integer> charCount = GetCount.getCharCount(charactersInString);
        charCount.forEach((key,value) ->{
            System.out.println(key + ": " + value);
        });
    }
}

