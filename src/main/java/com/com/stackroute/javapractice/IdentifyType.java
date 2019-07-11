package com.stackroute.javapractice;

import java.util.Scanner;

public class IdentifyType {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Enter the input for type");
            char input_letter = sc.next().charAt(0);
            if (Character.isUpperCase(input_letter)) {
                System.out.println("Upper case");
            } else if (Character.isLowerCase(input_letter)) {
                System.out.println("Lower case");
            } else if (Character.isDigit(input_letter)) {
                System.out.println("Number");
            } else {
                System.out.println("Special Symbol");
            }


        }

    }
}
