package com.learning.core.day2session1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class D02P05h {
	
	public static List<String> findMatchingStrings(String[] dictionary, String pattern) {
        List<String> matches = new ArrayList<>();

        
        for (String word : dictionary) {
            if (word.length() == pattern.length()) {
                Map<Character, Character> map = new HashMap<>();
                boolean isMatch = true;

               
                for (int i = 0; i < word.length(); i++) {
                    char patternChar = pattern.charAt(i);
                    char wordChar = word.charAt(i);

                  
                    if (map.containsKey(patternChar)) {
                        if (map.get(patternChar) != wordChar) {
                            isMatch = false;
                            break;
                        }
                    } else {
                        
                        map.put(patternChar, wordChar);
                    }
                }

                
                if (isMatch) {
                    matches.add(word);
                }
            }
        }
        return matches;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the words in the dictionary separated by space:");
        String dictionaryInput = scanner.nextLine();
        System.out.println("Enter the pattern:");
        String pattern = scanner.nextLine();
        scanner.close();

       
        String[] dictionary = dictionaryInput.split(" ");

        
        List<String> matchingStrings = findMatchingStrings(dictionary, pattern);

       
        System.out.println("Output:");
        for (String word : matchingStrings) {
            System.out.print(word + " ");
        }
    }

}
