package com.company;

public class Scope {
    public static void main(String[] args) {
        int a = 10;
        int b=20;
        String name = "Lakshay";
        {
//           int a=78; already initialised outside the block hence you cannot initialise again
            a = 100; // reassign the orign ref variable to some other value
            int c= 99;
            System.out.println(a);
            System.out.println(c);
            name = "kunal";
            System.out.println(name);

            //values initialised in the block will remain int the block
        }
        int c = 90;
        System.out.println(name);
        System.out.println(a);
        System.out.println(c);// cannot use outside the block

        for (int i = 0; i < 4; i++) {
            System.out.println(i);
            int num = 90;
            a =10;
        }
//        System.out.println(i);
    }
    static void random(int marks){
        int num = 67;
        System.out.println(num);
        System.out.println(marks);
    }
}
