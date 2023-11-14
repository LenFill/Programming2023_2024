package exampleLab1;
import java.util.Scanner;
public class Example_15 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int number1 = in.nextInt();
        System.out.print("Enter the second number: ");
        int number2 = in.nextInt();
        System.out.printf("Summa = %s \nRaznost = %s", number1+number2, number1-number2);
        in.close();

    }
}
