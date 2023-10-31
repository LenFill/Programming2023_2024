package exampleLab3;

import java.util.Scanner;

/*
Напишите программу, в которой вычисляется сумма чисел, удовлетворяющих таким критериям:
при делении числа на 5 в остатке получа-ется 2, или при делении на 3 в остатке получается 1.
 Количество чисел в сумме вводится пользователем. Программа отображает числа, которые суммируются, и значение суммы.
 Реализовал с помощью цикла While.
 */
public class Example_5_While {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите количество: ");
        int num = in.nextInt();
        int y = 0, x = 0 ;
        while (num !=0){
            int ostatok1 = x % 5;
            int ostatok2 = x % 3;
            if (ostatok1 == 2 || ostatok2 == 1){
                System.out.println(x);
                num--;
                y = y + x;
            }
            x++;
        }
        System.out.println("Сумма чисел равнв: " + y);
        in.close();
    }
}
