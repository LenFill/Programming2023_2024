package exampleLab1;
import java.util.Scanner;

public class Example_13 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int number1 = in.nextInt();
        System.out.print("Enter the second number: ");
        int number2 = in.nextInt();
        int number3 = number1 + number2;
        System.out.printf("The sum of the numbers is %d", number3);
        in.close();

    }

}
