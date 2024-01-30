package exampleLab6.example_8;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] array = {10, 4, 6, 14, 3};
        System.out.println("Исходный массив: "+ Arrays.toString(array));
        System.out.println("Среднее значение массива: " + Example_8.averageArray(array));
    }
}
