import java.util.Scanner;

// Write a program to print the sum of negative numbers, sum of positive even numbers and the sum of positive odd numbers from a list of numbers (N) entered by the user. The list terminates when the user enters a zero.
public class Q26 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int nSum=0, eSum=0, oSum=0;

        while (true){
            int n= input.nextInt();
            if (n==0){
                break;
            }
            if (n %2 ==0) {
                eSum+=n;

            }
            else if (n<0) {
                nSum+=n;
            }
            else {
                oSum+=n;
            }
        }

        System.out.println("Sum of -ve number ="+nSum);
        System.out.println("Sum of +ve even number ="+eSum);
        System.out.println("Sum of +ve odd number ="+oSum);

    }
}
