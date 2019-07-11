package com.stackroute.javapractice;

import java.util.Random;
import java.util.Scanner;

public class GuessTarget {
    public static void main(String[] args) {
        Random rand=new Random();
        int target = rand.nextInt(100);
        int guess=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Guess the number Between 1 to 100");
        while (target != guess) {
            guess = sc.nextInt();
            if (guess > target) {
                System.out.println("Guessed number is greater than target");
            } else {
                System.out.println("Guessed number is lesser than target");
            }
        }
        System.out.println("You Guessed Correct");

    }
}