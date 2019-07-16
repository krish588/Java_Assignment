package com.stackroute.pe1;

import java.util.Scanner;

public class LastRepeat {
    public String lastRepeat(String str,int number) {
        StringBuilder sb = new StringBuilder();
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the string");
//        String str = sc.nextLine();
//        System.out.println("Enter number of repeats");
//        int number = sc.nextInt();
        for (int i = 0;i<str.length()-number; i++) {
            sb.append(str.charAt(i));
        }
        for (int i = 0; i < number+1; i++) {
            for (int j = str.length() - number; j < str.length(); j++) {
                sb.append(str.charAt(j));
            }
        }
        return sb.toString();
    }
}
