package org.bonus;


import java.util.HashMap;
import java.util.Set;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashMap<Character, Integer> occurrences = new HashMap<>();
        String wordToSearch;

        System.out.println("Insert a word:");
        wordToSearch = scanner.nextLine();

        for(char c : wordToSearch.toCharArray()){
            if(Character.isLetter(c)){
                c = Character.toLowerCase(c);
                occurrences.put(c, occurrences.getOrDefault(c, 0) + 1);
            }
        }

        Set<Character> keys = occurrences.keySet();
        for (Character key : keys) {
            Integer value = occurrences.get(key);
            System.out.println(key + ": " + value);
        }

    }
}
