package exampleLab3;

import java.util.Arrays;
import java.util.Scanner;

/*
Напишите программу, в которой создается одномерный символьный массив из 10 элементов.
Массив заполняется буквами «через одну», начиная с буквы ' а ':
то есть массив заполняется буквами 'а', 'с', ' е', 'д' и так далее.
Отобразите массив в консольном окне в прямом и обратном порядке. Размер массива задается переменной.
 */
public class Example_7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите размер массива: ");
        int num = in.nextInt();
        char[] int1 = new char[num];
        int x = 0, y = 0;
        String alfavit = "абвгдеёжзийклмнопрстуфхцчшщъыьэюя";
        char[] numer = alfavit.toCharArray();
        while (num != 0){
            int1[y] = numer[x];
            x = x + 2;
            num--;
            y++;
        }
        System.out.println(Arrays.toString(int1));
        in.close();

    }
}
