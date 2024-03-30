package org.launchcode;
import  java.util.Scanner;

public class FindString {
    public  static  void  main(String[] args){
        String str = "Alice was beginning to get very tired of sitting by her sister on the " +
                "bank, and of having nothing to do: once or twice she had peeped into the book" +
                " her sister was reading, but it had no pictures or conversations in it, ‘and what" +
                " is the use of a book,’ thought Alice ‘without pictures or conversation?’";

        Scanner input = new Scanner(System.in);

        System.out.println("Please, enter a term to search in the string : ");
        String searchTerm = input.nextLine();
        boolean result = str.toLowerCase().contains(searchTerm.toLowerCase());
        if(result) {
            System.out.println("Your search term is found in the string.");
            Integer index = str.indexOf(searchTerm);
            Integer len = searchTerm.length();
            System.out.println("Your search term first appear at index " + index + ". Your term is "
            + len + " character long.");

            String modifiedString = str.replace(searchTerm,"");
            System.out.println(modifiedString);
        }
        else  System.out.println("Your search term does not found.");
    }
}
