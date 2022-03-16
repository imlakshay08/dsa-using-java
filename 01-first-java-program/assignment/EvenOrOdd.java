import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number to check for Even or Odd : ");
        double num1 = input.nextDouble();
        if (num1 % 2 == 0){
            System.out.println("Number entered is Even");
        }
        else {
            System.out.println("Number entered is Odd");
        }
    }
}
