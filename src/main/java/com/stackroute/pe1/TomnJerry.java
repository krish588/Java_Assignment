package com.stackroute.pe1;

import java.util.Scanner;

public class TomnJerry {
    public String tomNJerry(int input_value) {

//            Scanner sc = new Scanner(System.in);
//            System.out.println("Choose the number");
//            int input_value = sc.nextInt();
            if (input_value >= 20 && input_value <= 30) {

                if (input_value % 2 == 0) {
                    return ("Jerry");

                } else {
                    return  ("Tom");
                }
            } else {
                return ("Out of Bound");
            }
        }

}
