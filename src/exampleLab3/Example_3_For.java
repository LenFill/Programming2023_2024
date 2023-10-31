package exampleLab3;

import java.util.Scanner;

/*
Напишите программу, которая выводит последовательность чисел Фибоначчи.
Первые два числа в этой последовательности равны 1, а каждое следующее число равно сумме двух предыдущих
(получается по-следовательность 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89 и так далее). Количество чисел в последовательности вводится пользователем.
Оператор цикла For
 */
public class Example_3_For {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число");
        int num;
        int x = 1, y = 0;
        for (num = in.nextInt(); num !=0; num--){
            int num1 = x;
            System.out.print(num1);
            num1 = x + y;
            y = x;
            x = num1;
        }
        in.close();

    }
}
