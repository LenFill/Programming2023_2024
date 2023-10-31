package exampleLab3;

import java.util.Scanner;

/*
Напишите программу, в которой вычисляется сумма чисел, удовлетворяющих таким критериям:
при делении числа на 5 в остатке получа-ется 2, или при делении на 3 в остатке получается 1.
 Количество чисел в сумме вводится пользователем. Программа отображает числа, которые суммируются, и значение суммы.
 Реализовал с помощью оператора For
 */
public class Example_5_For {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите количество: ");
        int y = 0, x = 0 ;
        for ( int num = in.nextInt() ; num !=0; num++){
            int ostatok1 = x % 5;
            int ostatok2 = x % 3;
            if (ostatok1 == 2 || ostatok2 == 1){
                System.out.println(x);
                y = y + x;
            }
            x++;
        }
        System.out.println("Сумма чисел равна: " + y);
        in.close();
    }
}
