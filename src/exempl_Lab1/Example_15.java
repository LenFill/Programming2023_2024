package exempl_Lab1;
import java.util.Scanner;
public class Example_15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int number1 = input.nextInt();
        System.out.print("Enter the second number: ");
        int number2 = input.nextInt();
        System.out.printf("Summa = %s \nRaznost = %s", number1+number2, number1-number2);
        input.close();

    }
}
