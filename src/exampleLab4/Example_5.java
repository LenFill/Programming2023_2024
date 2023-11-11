package exampleLab4;

import java.util.Random;

/*
Напишите программу, в которой создается двумерный целочисленный
массив. Он заполняется случайными числами. Затем в этом массиве строи и
столбцы меняются местами: первая строка становится первым столбцом,
вторая строка становиться вторым столбцом и так далее. Например, если
исходный массив состоял из 3 строк и 5 столбцов, то в итоге получаем массив
из 5 строк и 3 столбцов.

 */
public class Example_5 {
    public static void main(String[] args) {
        // Создаем матрицу
        int [] [] mass = new int[6][6];
        Random random = new Random();
        for (int i = 0; i < 6; i++){
            for (int j = 0; j < 6; j++){
                mass [i][j] = random.nextInt(99);
                System.out.print( mass [i][j] + " ");
            }
            System.out.println();
        }
        // Транспонируем матрицу
        for (int i = 0; i < 6; i++){
            for (int j = i+1; j < 6; j++){
                int  trans =  mass [i][j];
                mass [i][j] = mass [j] [i];
                mass [j] [i] = trans;

            }

        }
        System.out.println();
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                System.out.print(mass[i][j] + " ");
            }
            System.out.println();
        }

    }
}
