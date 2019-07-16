package com.stackroute.pe1;

import java.util.Scanner;

public class Reverse {
    public String reverse(String str) {
//        Scanner sc=new Scanner(System.in);
//        System.out.println("Enter the string to reverse");
//        String str = sc.nextLine();
        String reverse="";
        for (int i = str.length()-1; i >= 0; i--) {
            reverse = reverse + str.charAt(i);
        }
        return (reverse);
    }
}
