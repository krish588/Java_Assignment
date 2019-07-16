package com.stackroute.pe1;

import java.util.Scanner;

public class VowelnConsonent {
    public String vowelNConsonent(String word) {

//            Scanner sc = new Scanner(System.in);
//            System.out.println("Enter the word");
//            String word = sc.nextLine();
            for (int i = 0; i < word.length(); i++) {
                if (word.charAt(i) == 'a' || word.charAt(i) == 'e' || word.charAt(i) == 'i' || word.charAt(i) == 'o' || word.charAt(i) == 'u') {
                    return ("Vowel");

                } else {
                    return ("Consonent");
                }
            }
        return word;
    }
}
