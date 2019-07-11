package com.stackroute.javapractice;

import java.util.Scanner;

public class Iteration {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Number of times to be iterated");
        int no_iterations = sc.nextInt();
        for (int i = 0; i < no_iterations+1; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(i);
            }
        }
    }
}
