package com.stackroute.pe1;

//import java.util.Scanner;

public class Palindrome {

    public String PalindromeChecker(int input_value) {

//        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
//        int input_value = sc.nextInt();
        int sum = 0, r, evensum = 0;
        int compare_value = input_value;

//        System.out.println(input_value);
//        System.out.println(compare_value);

        for (int i = 0; compare_value > 0; i++) {
            r = compare_value % 10;
            if (r % 2 == 0) {
                evensum = evensum + r;
            }
            sum = (sum * 10) + r;
//            System.out.println(sum);
            compare_value = compare_value / 10;
        }
        if (input_value == sum) {
//            System.out.println("palindrome");
            if (evensum >= 25) {
                return ("palindrome Even number sum is greater than 25");
            } else {
                return ("palindrome Even number sum is lesser then 25");
            }

        } else {
           return ("not palindrome");
        }

    }
}

