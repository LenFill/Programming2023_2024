package exampleLab6.example_10;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] num = {4, 5, 7, 2, 9,1};
        System.out.println("Исходный массив: " + Arrays.toString(num));
        System.out.println("Максимальное и минимальное значение: " + Arrays.toString(Example_10.findMinMax(num)));
    }
}
