package exampleLab6.example_10;
/*
Напишите программу со статическим методом, аргументом которому передается произвольное количество целочисленных
аргументов. Результатом метод возвращает массив из двух элементов: это значения наибольшего и
наименьшего значений среди аргументов, переданных методу.
 */
public class Example_10 {
    public static int[] findMinMax (int[] num){
        int min = num[0];
        int max = num[0];
        for (int x : num){
            if(x < min){
                min = x;
            }
            if(x > max){
                max = x;
            }
        }
        return new int[]{min, max};
    }
}
