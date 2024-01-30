package exampleLab6.example_9;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        char[] array = {'a', 'v', 'f', 'r', 'k'};
        System.out.println("Исходныый массив: " + Arrays.toString(array));
        System.out.println("Обратный массив: " + Arrays.toString(Example_9.reverseArray(array)));
    }
}
