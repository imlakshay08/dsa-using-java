import java.util.Scanner;

public class GreetingName {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your Name : ");
        String str = input.nextLine();
        System.out.println("Hello " + str);
    }
}
