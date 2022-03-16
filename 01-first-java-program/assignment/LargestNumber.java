import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first number = ");
        int num1 = input.nextInt();
        System.out.print("Enter the second number = ");
        int num2 = input.nextInt();

        if (num1>num2){
            System.out.println("First Number is larger.");
        }
        else {
            System.out.println("Second Number is larger.");
        }

    }
}
