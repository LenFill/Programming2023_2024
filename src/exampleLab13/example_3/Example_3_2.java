package exampleLab13.example_3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Example_3_2 {
    static void main(String[] args) {
        try {
            Scanner in = new  Scanner(System.in);

            System.out.println("Введите размер массива:");
            int size = in.nextInt();
            byte[] arr = new byte[size];

            long sum = 0;

            System.out.println("Ввведите элементы массива: ");
            for (int i = 0; i<size; i++){
                arr[i] = in.nextByte();
                sum += arr[i];
            }
            if(sum < Byte.MIN_VALUE || sum > Byte.MAX_VALUE){
                throw new ArithmeticException(
                        "Сумма выходит за диапазон byte");
            }
            System.out.println("Сумма элементов: " + sum);
        } catch (InputMismatchException e){
            System.out.println("Ошибка: Требуется целое число от -128 до 127.");
        } catch (ArithmeticException e){
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Программа завершена. ");
        }
    }
}
