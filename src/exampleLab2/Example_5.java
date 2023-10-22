package exampleLab2;

import java.util.Scanner;

/*
Напишите программу, которая проверяет, сколько тысяч во введенном пользователем числе
(определяется четвертая цифра справа в десятичном представлении числа).
 */
public class Example_5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число: ");
        int num = in.nextInt();
        int  cheloe = num / 1000;
        if (cheloe != 0){
            if (cheloe == 1)
            System.out.printf("Введеном числе %d тысяча", cheloe);
            else if (cheloe > 1 && cheloe <5)
                System.out.printf("Введеном числе %d тысячи", cheloe);
            else
                System.out.printf("Введеном числе %d тысяч", cheloe);
        }
        else
            System.out.println("Введенном числе тысяч нет");
        in.close();
    }
}
