package exampleLab3;

import java.util.Arrays;
import java.util.Scanner;
/*
Напишите программу, в которой создается одномерный числовой массив и заполняется числами,
которые при делении на 5 дают в остатке 2 (числа 2, 7,12,17 и так далее).
Размер массива вводится пользователем.
Предусмотреть обработку ошибки, связанной с вводом некорректного значения.
 */
public class Example_6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число: ");
        int num1 = in.nextInt();
        if(num1<=0)
            System.out.println("Введите число больше нуля.");
        int[] num = new int[num1];
        int id = 0, x =0;
        while(num1 != 0 ){
            int ostatok = x % 5;
            if (ostatok == 2){
                num[id] = x;
                num1--;
                id++;
            }
            x++;
        }
        System.out.println(Arrays.toString(num));
        in.close();
    }
}
