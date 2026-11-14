package exampleLab12;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Example_5 {
    static void main(String[] args) throws InterruptedException {
        Scanner in = new  Scanner(System.in);
        Random random = new  Random();
        System.out.println("Введите размер массива: ");
        int size = in.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++){
            arr[i] = random.nextInt(99);
        }
        System.out.println("Массив arr: ");
        System.out.println(Arrays.toString(arr));
        System.out.println("Максимальный элемент: " + findMax(arr));
    }
    public static int findMax(int[] arr) throws InterruptedException {
        int count = Runtime.getRuntime().availableProcessors();
        Thread[] t = new Thread[count];
        int[] maxValues = new int[count];
        for (int i = 0; i < count; i++) {
            int index = i;
            int start = i * arr.length / count;
            int end = (i + 1) * arr.length / count;
            t[i] = new Thread(() -> {
                maxValues[index] = Arrays.stream(arr, start, end)
                        .max()
                        .orElse(Integer.MIN_VALUE);
            });
            t[i].start();
        }
        for (Thread thread : t) {
            thread.join();
        }
        return Arrays.stream(maxValues).max().orElse(Integer.MIN_VALUE);
    }
}
