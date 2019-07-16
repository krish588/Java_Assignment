package com.stackroute.pe1;

import java.util.Scanner;

public class Iteration {
    public String iteration(int no_iterations){
//        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
//        System.out.println("Number of times to be iterated");
//        int no_iterations = sc.nextInt();
        for (int i = 0; i < no_iterations+1; i++) {
            for (int j = 0; j < i; j++) {
               sb.append(i);
            }
        }
        return sb.toString();
    }
}
