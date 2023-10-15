package exempl_Lab1;

import java.util.Scanner;

public class Example_8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the day of the week: ");
        String dayWeek = in.nextLine();
        System.out.print("Enter the name of the month: ");
        String nameMonth = in.nextLine();
        System.out.print("Enter the day number: ");
        int dayNum = in.nextInt();
        System.out.printf("Today %s, %d, %s", dayWeek, dayNum, nameMonth);
        in.close();
    }
}
