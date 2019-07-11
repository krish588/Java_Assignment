package com.stackroute.pe1;

import java.util.Scanner;

public class TomnJerry {
    public static void main(String[] args) {
        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Choose the number");
            int input_value = sc.nextInt();
            if (input_value >= 20 && input_value <= 30) {

                if (input_value % 2 == 0) {
                    System.out.println("Jerry");

                } else {
                    System.out.println("Tom");
                }
            } else {
                System.out.println("Out of Bound");
            }
        }
    }
}
