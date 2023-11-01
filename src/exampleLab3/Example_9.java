package exampleLab3;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/*
Напишите программу, в которой создается массив и заполняется случайными числами.
Массив отображается в консольном окне. В этом массиве необходимо определить элемент с минимальным значением.
В частности, программа должна вывести значение элемента с минимальным значением и индекс этого элемента.
Если элементов с минимальным значением несколько, должны быть выведены индексы всех этих элементов.
 */
public class Example_9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите размер массива: ");
        int num = in.nextInt();
        int[] indexs = new int[num];
        int[] nums = new int[num];
        Random random = new Random();
        for (int i = 0; i < nums.length; i++){
            nums[i] = random.nextInt(99);
        }
        System.out.println(Arrays.toString(nums));
        int min = nums[0];
        int  mins = 0,counter = 1;
        for (int i = 1; i < nums.length; i++ ){
            if(nums[i]< min){
                min = nums[i];
                indexs[mins] = i;
                counter = 1;
                } else if (nums[i]== min ) {
                mins++;
                indexs[mins] = i;
                counter++;
            }
        }
        System.out.println(min);
        int[] des = Arrays.copyOfRange(indexs, 0, counter);
        System.out.print("Индекс минимального числа: " + Arrays.toString(des));
        in.close();
    }
}
