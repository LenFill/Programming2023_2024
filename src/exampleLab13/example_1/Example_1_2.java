package exampleLab13.example_1;

import java.util.Scanner;

public class Example_1_2 {
    static void main(String[] args) {
        Scanner in = new  Scanner(System.in);
        System.out.println("Введите размер массив: ");
        int size = in.nextInt();
        int[] arr = new int[size];

        long sum = 0;
        int count = 0;

        System.out.println("Введите элементы массива: ");
        for(int i = 0; i < size; i++){
            arr[i] = in.nextInt();
            if (arr[i] > 0) {
                sum += arr[i];
                count++;
            }
        }
        if (count == 0) {
            throw new IllegalArgumentException("Положительные элементы отсутствуют");
        }
        System.out.println("Среднее значение: " + (double) sum / count);
    }
}
