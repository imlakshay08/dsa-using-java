package com.lakshay;

public class Comparison {
    public static void main(String[] args) {
        String a="lakshay";
        String b="lakshay";
        String c=a;
//        System.out.println(c==a);

        //==
//        System.out.println(a==b);

        String name1 = new String("lakshay");
        String name2 = new String("lakshay");


        System.out.println(name1==name2);
        System.out.println(name1.equals(name2));
        System.out.println(name1.charAt(1));
    }
}
