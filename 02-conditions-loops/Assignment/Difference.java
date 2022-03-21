package com.company;

import java.util.Scanner;

public class Difference {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the digit : ");
        int num = in.nextInt();
        int prod=1, sum=0, diff;
        while (num>0){
            int rem = num % 10;
            prod *= rem;
            sum += rem;
            num /= 10;
        }
        diff = prod - sum;
        System.out.println("Difference = " + diff);
    }

}