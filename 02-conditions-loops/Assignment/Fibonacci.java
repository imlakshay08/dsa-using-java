package com.company;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n1=0, n2=1, n3;
        System.out.print("Enter the sequence length : ");
        int n = in.nextInt();

        System.out.print( n1 +" " + n2 );
        for (int i = 3; i <= n; i++) {
            n3=n1+n2;
            System.out.print(" "+n3);
            n1 = n2;
            n2 = n3;
        }
    }
}
