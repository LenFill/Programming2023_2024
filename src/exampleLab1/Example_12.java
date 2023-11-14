package exampleLab1;
import java.util.Scanner;
import java.time.YearMonth;

public class Example_12 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a name: ");
        String name = in.nextLine();
        System.out.print("Enter the age: ");
        int age = in.nextInt();
        int gate = YearMonth.now().getYear();
        System.out.printf("%s was born in %d", name, (gate - age));
        in.close();
    }

}
