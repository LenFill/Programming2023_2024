package exampleLab3;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import java.util.Collections;

/*
Напишите программу, в которой создается целочисленный массив, заполняется случайными числами и
после этого значения элементов в массиве сортируются в порядке убывания значений.
 */
public class Example_10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите размер массива: ");
        int num = in.nextInt();
        Integer [] nums = new Integer [num];
        Random random = new Random();
        for (int i = 0; i < nums.length; i++){
            nums[i] = random.nextInt(99);
        }
        System.out.println(Arrays.toString(nums));
        Arrays.sort(nums, Collections.reverseOrder());
        System.out.println("Отсартированный массив: " + Arrays.toString(nums));
    }
}
