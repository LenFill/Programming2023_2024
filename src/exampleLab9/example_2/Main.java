package exampleLab9.example_2;
/*
Создать приложение с использованием рекурсии для перевода целого числа,
введенного с клавиатуры, в двоичную систему счисления.
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите чесло: ");
        Scanner in = new Scanner(System.in);
        BitRecursion.BitRec(in.nextInt());
    }
}
