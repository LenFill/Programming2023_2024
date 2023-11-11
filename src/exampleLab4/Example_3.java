package exampleLab4;
/*
Напишите программу, в которой создается двумерный массив, который
выводи прямоугольник из цифр 2;
 */
public class Example_3 {
    public static void main(String[] args) {
        int [] [] thoDimArray = new int [5] [7];
        for (int i= 0; i < 5; i++) {
            for (int j = 0; j < 7; j++) {
                thoDimArray[i][j] = 2;
                System.out.print(thoDimArray[i][j]);
            }
            System.out.println();
        }
    }
}
