package exampleLab3;

import java.util.Arrays;
import java.util.Scanner;
/*
Напишите программу, в которой создается символьный массив из 10 элементов.
Массив заполнить большими (прописными) буквами английского алфавита.
Буквы берутся подряд, но только согласные (то есть гласные буквы ’ А',1Е' и ' I' при присваивании значений
элементам массива нужно пропустить). Отобразите содержимое созданного массива в консольном окне.
 */
public class Example_8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите размер массива: ");
        int num = in.nextInt();
        char[] int1 = new char[num];
        int x = 0, y = 0;
        String alfavit = "BCDFGHJKLMNPQRSTVWXZ";
        char[] numer = alfavit.toCharArray();
        while (num != 0){
            int1[y] = numer[x];
            x++;
            num--;
            y++;
        }
        System.out.println(Arrays.toString(int1));
        in.close();


    }
}
