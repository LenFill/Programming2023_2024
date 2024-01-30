package exampleLab6.example_7;
/*
Напишите программу со статическим методом, аргументом которому передастся символьный массив,
а результатом возвращается ссылка на целочисленным массив, состоящий из кодов символов из массива- аргумента.
 */
public class Example_7 {
    public static int[] charArray(char[] array){
        int[] numArray = new int[array.length];
        for (int x = 0; x < array.length ; x++){
            numArray[x] = (int) array[x];
        }
        return numArray;
    }
}
