package exampleLab6.example_6;
/*
Напишите программу со статическим методом, которому аргументом передается целочисленный массив и целое число.
Результатом метод возвращает ссылку на новый массив, который получается из исходного массива
(переданного первым аргументом методу), если в нем взять несколько начальных элементов. Количество элементов,
которые нужно взять из исходного массива, определяются вторым аргументом метода. Если второй аргумент метода
больше длины массива, переданного первым аргументом, то методом создается копия исходного массива и
возвращается ссылка на эту копию.
 */
import java.util.Arrays;
public class Example_6 {
    public static int[] numArray(int[] array, int num) {
        if (num <= 0)
            System.out.println("Колличество элементов должно быть больше нуля");
        if (num <= array.length) {
            int[] newArray = Arrays.copyOf(array, num);
            return newArray;
        } else
            return array;
    }
}
