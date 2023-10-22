package exampleLab2;

import java.util.Scanner;

/*
Напишите программу, которая проверяет, удовлетворяет ли введенное пользователем число следующим критериям:
при делении на 5 в остатке получается 2, а при делении на 7 в остатке получается 1.
 */
public class Example_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число: ");
        int num = in.nextInt();
        int ostatok1 = num % 5;
        int ostatok2 = num % 7;
        if (ostatok1 == 2 && ostatok2 == 1)
            System.out.println("Введенное число подходит");
        else
                System.out.println("Введенное число не подходит");
        in.close();
    }
}
