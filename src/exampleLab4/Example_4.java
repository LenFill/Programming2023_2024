package exampleLab4;
/*
Напишите программу, в которой создается двумерный массив, который
выводит прямоугольный треугольник;
 */
public class Example_4 {
    public static void main(String[] args) {
        int [] [] thoDimArray = new int [5] [5];
        for (int i= 0; i < 5; i++){
            for (int j =0; j <= i ; j++){
                thoDimArray [i][j] = 2;
                System.out.print(thoDimArray[i][j]);
            }
            System.out.println();
        }
    }
}
