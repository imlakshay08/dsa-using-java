/*
Define two methods to print the maximum and the minimum number respectively among three numbers entered by the user.
 */

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter first : ");
        int first = input.nextInt();
        System.out.println("Enter second : ");
        int second = input.nextInt();
        System.out.println("Enter third : ");
        int third = input.nextInt();

        int max = max(first, second, third);
        int min = min(first, second, third);
        System.out.println(max);
        System.out.println(min);
    }

    static int max(int num1, int num2, int num3){

      int largest=num1;
      if (num2>largest){
          largest=num2;
      }

      if (num3>largest){
          largest = num3;
      }

      return largest;
    }

    static int min(int num1, int num2, int num3){
        int smallest = num1;
        if (num2 < smallest) {
            smallest = num2;
        }
        if (num3 < smallest){
            smallest = num3;
        }
        return smallest;
    }
}
