package exampleLab7.example_4;
/*
Напишите программу, в которой использована цепочка наследования из трех
классов. В первом классе есть открытое символьное поле. Во втором классе появляется
открытое текстовое поле. В третьем классе появляется открытое целочисленное поле. В
каждом из классов должен быть конструктор, позволяющий создавать объект на основе
значений полей, переданных аргументами конструктору, а также конструктор создания
копии.
 */
public class Main {
    public static void main(String[] args) {
        SuperClass SuperClass = new SuperClass('t');
        SuperClass.getPrint();
        SubClass SubClass = new SubClass('x', "Проверка");
        SubClass.getPrint();
        SubSubClass SubSubClass = new SubSubClass('h', "Повторная проверка", 234);
        SubSubClass.getPrint();
    }
}
