package org.launchcode;

import java.util.HashMap;

public class GetCount {
    public static HashMap<Character,Integer> getCharCount(char[] charactersInString){
        HashMap<Character, Integer> charCount = new HashMap<>();
        for (char character : charactersInString) {
            //System.out.println(character);
            if (charCount.containsKey(character)) {
                charCount.put(character, charCount.get(character) + 1);
            } else {
                charCount.put(character, 1);
            }
        }
        return charCount;
    }
}
