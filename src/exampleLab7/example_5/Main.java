package exampleLab7.example_5;
/*
Напишите программу, в которой есть суперкласс с защищенным текстовым полем,
конструктор с текстовым параметром и метод, при вызове которого в консольном окне
отображается название класса и значение поля. На основе суперкласса создаются два
подкласса (оба на основе одного и того же суперкласса). В одном из классов появляется
защищенное целочисленное поле, там есть конструктор с двумя параметрами и
переопределен метод для отображения значений полей объекта и названия класса. Во
втором подклассе появляется защищенное символьное поле, конструктор с двумя
параметрами и переопределен метод, отображающий в консоли название класса и значения
полей. В главном методе создайте объекты каждого из классов. Проверьте работу метода,
отображающего значения полей объектов, для каждого из объектов. Вызовите этот же
метод через объектную переменную суперкласса, которая ссылается на объект
производного класса.
 */
public class Main {
    public static void main(String[] args) {
        SuperClass superClass = new SuperClass("Проверка");
        superClass.showInfo();
        SubClass1  subClass1 = new SubClass1("Проверка саба1", 24);
        subClass1.showInfo();
        SubClass2  subClass2 = new SubClass2("Проверка саба2", 'l');
        subClass2.showInfo();
    }
}
