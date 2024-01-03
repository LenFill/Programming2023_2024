package exampleLab5.example_3;

import exampleLab5.example_2.Example_2;

/*
Напишите программу с классом, у которого есть два целочисленных поля.
В классе должны быть описаны конструкторы, позволяющие создавать
объекты без передачи аргументов, с передачей одного аргумента и с передачей
двух аргументов.
*/
public class Example_3 {
    private int num1;
    private int num2;
    public Example_3(){
        System.out.println("Нет аргументов");
    }
    public Example_3(int num2){
        System.out.println("Есть один аргумент " + num2);
    }
    public Example_3(int num1, int num2){
        System.out.println("Есть оба аргумента " + num1 + " " + num2);
    }
}
