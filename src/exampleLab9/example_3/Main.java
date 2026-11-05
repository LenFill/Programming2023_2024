package exampleLab9.example_3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите размер массива: ");
        int size = in.nextInt();
        int[] array = new int[size];

        System.out.println("Введите элементы массива:");
        inputArray(array, 0, in);

        System.out.println();
        outputArray(array, 0);

    }
    public static void inputArray(int[] array, int index, Scanner in){
        if (index < array.length){
            array[index] = in.nextInt();
            inputArray(array, index+1, in);
        }
    }

    public static void outputArray(int[] array, int index){
        if (index < array.length){
            System.out.println(array[index] + " ");
            outputArray(array, index + 1);
        }
    }
}
