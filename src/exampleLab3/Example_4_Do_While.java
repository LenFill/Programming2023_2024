package exampleLab3;

import java.util.Scanner;

/*
Напишите программу, в которой пользователем вводится два целых числа. Программа выводит все целые числа — начиная с
наименьшего (из двух введенных чисел) и заканчивая наибольшим (из двух введенных чисел).
Предложите разные версии программы. Оператор цикла Do While.
 */
public class Example_4_Do_While {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        int num1 = in.nextInt();
        System.out.println("Введите второе число: ");
        int num2 = in.nextInt();
        if(num1 > num2) {
            int x;
            x = num2;
            num2 = num1;
            num1 = x;
        } do{
            System.out.println(num1);
            ++num1;
        }
        while (num1 <= num2);
        in.close();
    }
}
