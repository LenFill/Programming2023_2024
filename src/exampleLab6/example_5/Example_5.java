package exampleLab6.example_5;
/*
Напишите программу со статическим методом, которым вычисляется сумма квадратов
натуральных чисел 12 + 22 + 32 + ... + п2. Число п передается аргументом методу.
Для проверки результата можно использовать формулу 12 + 22 +32+…+n2=(n+l) (2n + 1)/6
 */
public class Example_5 {
    public static int sumSquare(int num){
        int square = 1;
        for (; num > 0 ;){
            square = square + (num * num);
            num --;
        }
        return square;
    }
}
