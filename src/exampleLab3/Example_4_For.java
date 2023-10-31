package exampleLab3;

import java.util.Scanner;

/*
Напишите программу, в которой пользователем вводится два целых числа. Программа выводит все целые числа — начиная с
наименьшего (из двух введенных чисел) и заканчивая наибольшим (из двух введенных чисел).
Предложите разные версии программы. Оператор цикла For
 */
public class Example_4_For {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        int num1 = in.nextInt();
        System.out.print("Введите второе число: ");
        int num2 = in.nextInt();
        if(num1 > num2) {
            int x;
            x = num2;
            num2 = num1;
            num1 = x;
        }

        for ( int y = num1; y <= num2; y++)
            System.out.println(y);
        in.close();

    }
}
