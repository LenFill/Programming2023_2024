package exampleLab4;
/*
Напишите программу, в которой создается двумерный числовой массив
и этот массив заполняется «змейкой»: сначала первая строка (слева направо),
затем последний столбец (снизу вверх), вторая строка (слева направо) и так
далее.

 */

import java.util.Random;

public class Example_7 {
    public static void main(String[] args) {
        int [][] mass = new int[7][7];
        Random random = new Random();
        for (int i = 0; i < 7; i++) {
            System.out.println();
            for (int j = 0; j < 7; j++){
                mass[i][j] = random.nextInt(10, 99);
                System.out.print(mass[i] [j]+ " ");
            }
        }

    }
}
