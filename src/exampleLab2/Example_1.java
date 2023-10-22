package exampleLab2;
import java.util.Scanner;
/*
Напишите программу, которая проверяет, делится ли введенное Пользователем число на 3.
 */
public class Example_1 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число: ");
        int num = in.nextInt();
        int ostatok = num % 3;
        if (ostatok != 0)
            System.out.println("Введенное число не делится на 3 ");
        else
                System.out.println("Введенное число делится на 3");
        in.close();

    }
}
