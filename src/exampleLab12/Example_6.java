package exampleLab12;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Example_6 {
    static void main(String[] args) throws InterruptedException {
        Scanner in = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Введите размер массива: ");
        int size = in.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = random.nextInt(99);
        }
        System.out.println("Массив arr: ");
        System.out.println(Arrays.toString(arr));
        System.out.println("Сумма элементов: " + findSum(arr));
    }
    public static int findSum(int[] arr) throws InterruptedException {
        int count = Runtime.getRuntime().availableProcessors();
        Thread[] t = new Thread[count];
        int[] sums = new  int[count];
        for (int i = 0; i < count; i++) {
            int index = i;
            int start = i * arr.length / count;
            int end = (i + 1) * arr.length / count;
            t[i] = new Thread(() -> {
                sums[index] = Arrays.stream(arr, start, end).sum();
            });
            t[i].start();
        }
        for (Thread thread : t) {
            thread.join();
        }
        return Arrays.stream(sums).sum();
    }
}

