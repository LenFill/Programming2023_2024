package exempleLab1;
import java.util.Scanner;
public class Example_14 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number: ");
        int number = in.nextInt();
        int number1 = number - 1;
        int number2 = number + 1;
        double number3 = Math.pow((number * 3), 2 );
        System.out.printf("%d %d %d %f ", number1, number, number2, number3);
        in.close();
    }

}
