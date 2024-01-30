package exampleLab6.example_8;
/*
Напишите программу со статическим методом, аргументом которому передается целочисленный массив,
а результатом возвращается среднее значение для элементов массива (сумма значений элементов,
деленная на количество элементов в массиве).
 */
public class Example_8 {
    public static double averageArray(int[] array){
        int sumArray = 0;
        for(int i = 0; i< array.length; i++){
            sumArray += array[i];
        }
        return sumArray / array.length;
    }
}
