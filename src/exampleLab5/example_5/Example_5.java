package exampleLab5.example_5;
/*
Напишите программу с классом, у которого есть закрытое целочисленное
поле. Значение полю присваивается с помощью открытого метода. Методу
аргументом может передаваться целое число, а также метод может вызываться
без аргументов. Если методы вызывается без аргументов, то поле получает
нулевое значение. Если метод вызывается с целочисленным аргументом, то
это значение присваивается полю. Однако если переданное аргументом
методу значение превышает 100, то значением полю присваивается число 100.
Предусмотрите в классе конструктор, который работает по тому же принципу
что и метод для присваивания значения полю. Также в классе должен быть
метод, позволяющий проверить значение поля.
*/
public class Example_5 {
    private int num1;
    public void setNum1(int num1) {
        this.num1 = num1;
    }
    public Example_5(){
        num1 = 0;
        System.out.println(num1);
    }
    public Example_5(int num1){
        if (num1>100)
            num1 = 100;
        else
            num1 = num1;
        System.out.println(num1);
    }
}