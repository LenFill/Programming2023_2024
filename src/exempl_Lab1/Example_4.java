package exempl_Lab1;
import java.util.Scanner;
public class Example_4 {
    public static void main(String[] atgs) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input a number: ");
        int num = in.nextInt();

        System.out.println("Your number" + num);
        in.close();
    }

}
