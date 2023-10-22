package exampleLab2;

import java.util.Scanner;

/*
Напишите программу, которая проверяет, удовлетворяет ли введенное пользователем число следующим критериям:
число делится на 4, и при этом оно не меньше 10.
 */
public class Example_3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число: ");
        int num = in.nextInt();
        int ostatok1 = num % 4;
        if (ostatok1 == 0 && num >= 10)
            System.out.println("Число подходит");
        else
            System.out.println("Число не подходит");
        in.close();

    }
}
