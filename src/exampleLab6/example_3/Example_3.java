package exampleLab6.example_3;
/*
Напишите программу с классом, в котором есть статические методы, которым можно передавать произвольное количество
целочисленных аргументов (или целочисленный массив). Методы, на основании переданных аргументов или массива,
позволяют вычислить: наибольшее значение, наименьшее значение, а также среднее значение из набора чисел.
 */
public class Example_3 {
    public static int numMax(int[] numbers){
        int max = numbers[0];
        for(int num : numbers){
            if(num > max){
                max = num;
            }
        }
        return max;
    }
    public static int numMin(int[] numbers){
        int  min = numbers[0];
        for(int num : numbers){
            if(num < min){
                min =num;
            }
        }
        return min;
    }
    public static double numAverage(int[] numbers){
        int sum = 0;
        for(int num : numbers){
            sum += num;
        }
        double part = sum / numbers.length;
        return  part;
    }
}
