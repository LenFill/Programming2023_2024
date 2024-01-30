package exampleLab6.example_6;

import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        int[] array = { 10, 15, 7, 8, 2};
        int num = -7;
        System.out.println("Начальный массив: "+ Arrays.toString(array));
        System.out.println("Длинна нового массива: " + num);
        System.out.println("Новый массив: "+ Arrays.toString(Example_6.numArray(array, num)));
    }
}
