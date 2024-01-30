package exampleLab6.example_9;
/*
Напишите программу со статическим методом, аргументом которому передается одномерный символьный массив.
В результате вызова метода элементы массива попарно меняются местами:
первый — с последним, второй — с предпоследним и так далее.
 */
public class Example_9 {
    public static char[] reverseArray (char[] array){
        char[] reversNewArray = new char[array.length];
        int indexArray = array.length - 1;
        int indexReversNewArray = 0;
        for( int i = 0; i < array.length; i++){
            reversNewArray[indexReversNewArray] = array[indexArray];
            indexArray --;
            indexReversNewArray ++;
        }
        return reversNewArray;
    }
}
