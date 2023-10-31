package exampleLab3;

import java.util.Scanner;

/*
Напишите программу, которая выводит последовательность чисел Фибоначчи.
Первые два числа в этой последовательности равны 1, а каждое следующее число равно сумме двух предыдущих
(получается по-следовательность 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89 и так далее). Количество чисел в последовательности вводится пользователем.
Оператор цикла While
 */
public class Example_3_While {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число");
        int num = in.nextInt();
        int x = 1, y = 0;
        while (num != 0){
            int num1 = x;
            System.out.print(num1);
            num1 = x + y;
            y = x;
            x = num1;
            num--;
        }
        in.close();

    }
}
