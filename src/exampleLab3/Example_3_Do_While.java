package exampleLab3;

import java.util.Scanner;

/*
Напишите программу, которая выводит последовательность чисел Фибоначчи.
Первые два числа в этой последовательности равны 1, а каждое следующее число равно сумме двух предыдущих
(получается по-следовательность 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89 и так далее). Количество чисел в последовательности вводится пользователем.
Оператор цикла Do While
 */
public class Example_3_Do_While {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число: ");
        int num = in.nextInt();
        int x = 1, y = 0, num1 = 1;
        do {

            System.out.print(num1 + ",");
            num1 = x + y;
            y = x;
            x = num1;
            num--;

        }
        while (num != 0);
        in.close();


    }
}
