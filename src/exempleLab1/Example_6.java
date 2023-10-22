package exempleLab1;

import java.util.Scanner;

public class Example_6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input last name: ");
        String lastName = in.nextLine();
        System.out.print("Input first name: ");
        String firstName = in.nextLine();
        System.out.print("Input patronymic: ");
        String patronymic = in.nextLine();
        System.out.printf("Hello %s %s %s",lastName,firstName,patronymic);
        in.close();
    }
}
