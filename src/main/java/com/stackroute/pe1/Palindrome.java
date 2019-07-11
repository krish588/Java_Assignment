package com.stackroute.pe1;

import java.util.Scanner;

public class Palindrome {

    public static void main(String[] args) {
        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the number");
            int input_value = sc.nextInt(), sum = 0, r;
            int compare_value = input_value;

            System.out.println(input_value);
            System.out.println(compare_value);

            for (int i = 0; compare_value > 0; i++) {
                r = compare_value % 10;
                sum = (sum * 10) + r;
//            System.out.println(sum);

                compare_value = compare_value / 10;
            }
            if (input_value == sum) {
                System.out.println("palindrome");
            } else {
                System.out.println("not palindrome");
            }
        }
    }
}

