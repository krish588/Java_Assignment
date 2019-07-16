package com.stackroute.pe1;

import java.util.Scanner;

public class IdentifyType {
    public String identifyType(char input_letter) {
        Scanner sc = new Scanner(System.in);
//            System.out.println("Enter the input for type");
//            char input_letter = sc.next().charAt(0);
            if (Character.isUpperCase(input_letter)) {
                return  ("Upper case");
            } else if (Character.isLowerCase(input_letter)) {
                return ("Lower case");
            } else if (Character.isDigit(input_letter)) {
                return ("Number");
            } else {
                return ("Special Symbol");
            }

    }
}
