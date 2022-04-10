package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        // Q: Store a roll no.
        int a = 19;

        // store a person's name
        String name = "Kunal kushwaha";

        // store 5 roll numbers
        int rno1=23;
        int rno2=55;
        int rno3=18;

        //syntax
        //datatype[] variable_name = new datatype[size];

        //store 5 numbers:
//
//        int[] rnos = new int[5];
//        // or directly
//        int[] rnos2 = {23, 12, 45, 32, 15};

        int[] ros; // declaration of arrya. ros is getting defined in the stack.
        ros =  new int[5]; // actually here object is being created in the memory (heap).

//        System.out.println(ros[1]);

        String[] arr = new String[4];
        System.out.println(arr[0]);

//        for (String element: arr){
//            System.out.println(element);
//        }
         
    }
}
