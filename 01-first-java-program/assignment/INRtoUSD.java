import java.util.Scanner;

public class INRtoUSD {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double USD;
        System.out.print("Enter the amount in Rupees = ");
        double INR = input.nextDouble();
        USD = INR / 76.26;
        System.out.println(" The amount in $ = " + USD);
    }
}
