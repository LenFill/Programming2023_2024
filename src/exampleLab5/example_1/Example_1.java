package exampleLab5.example_1;
/*
Напишите программу с классом, в котором есть закрытое символьное поле
и три открытых метода. Один из методов позволяет присвоить значение полю.
Еще один метод при вызове возвращает результатом код символа. Третий
метод позволяет вывести в консольное окно символ (значение поля) и его код.
*/
public class Example_1 {
    private char sim1;

    public void setSim1(char sim1) {
        this.sim1 = sim1;
    }

    public int getCode(){
        return  sim1;
    }

    public void showSim1AndCode() {
        System.out.print(sim1 + " ");
        System.out.print((int) sim1);
    }
}

