package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {
    public static void main(String[] args) {
        //syntax
        Scanner in=new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>(5);

//        list.add(67);
//        list.add(6234);
//        list.add(435);
//        list.add(343);
//        list.add(1213);
//        System.out.println(list);
////        System.out.println(list.contains(65));
//        list.set(0, 99);
//
//        list.remove(2);
//
//        System.out.println(list);

        //input
        for (int i = 0; i < 5; i++) {
            list.add(in.nextInt());
        }

        //get item at any index
        for (int i = 0; i < 5; i++) {
            System.out.println(list.get(i)); // pass index here, list[index will not work here]
        }
//        System.out.println(list);
    }
}
