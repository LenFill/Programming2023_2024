package exempl_Lab1;
import java.util.Scanner;
public class Example_9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the name month: ");
        String nameMonth = in.nextLine();
        System.out.print("Enter the number of days: ");
        int dayNum = in.nextInt();
        System.out.printf("%d days in %s", dayNum, nameMonth);
        in.close();

    }
}
