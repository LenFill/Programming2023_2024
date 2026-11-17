package exampleLab13.example_2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Example_2_2 {
    static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        Scanner in = new Scanner(System.in);
        try {
            System.out.println("Введите номер столбца от 1 до 3: ");
            int column = in.nextInt() - 1;
            for (int i = 0; i < matrix.length; i++) {
                System.out.println(matrix[i][column]);
            }
        } catch (InputMismatchException e) {
            System.out.println("Ошибка: Требуется целое число.");
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Столбец с таким номером отсутствует.");
        } finally {
            System.out.println("Программа завершена. ");
        }
    }
}
