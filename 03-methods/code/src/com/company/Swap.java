package com.company;

public class Swap {
    public static void main(String[] args) {
        int a=10, b=20;
        swap(a, b);
        System.out.println(a + " " + b);
        String name = "Lakshay Tyagi";
        changeName(name);
        System.out.println(name);
    }

     static void changeName(String name) {
        name = "Kunal Kushwaha";
    }

    static void swap(int num1, int num2){
        int temp = num1;
        num1=num2;
        num2=temp;

        //this change will only be valid in this function scope only.
    }
}
