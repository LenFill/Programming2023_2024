package exampleLab1;

import java.util.Scanner;

public class Example_7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input name ");
        String name = in.nextLine();
        System.out.print("Input the age ");
        int age = in.nextInt();
        System.out.printf("%s is %d years old.", name, age);
        in.close();
    }
}
