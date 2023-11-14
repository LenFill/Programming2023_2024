package exampleLab1;
import java.util.Scanner;
import java.time.YearMonth;

public class Example_11 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the name: ");
        String name = in.nextLine();
        System.out.print("Enter the year of birth: ");
        int yearOfBirth = in.nextInt();
        int year = YearMonth.now().getYear();
        System.out.printf("%s is %d years old", name, (year - yearOfBirth));
        in.close();

    }
}
