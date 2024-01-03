package exampleLab5.example_2;
/*
Напишите программу с классом, у которого есть два символьных поля и
метод. Он возвращает результат, и у него нет аргументов. При вызове метод
выводит в консольное окно все символы из кодовой таблицы, которые
находятся «между» символами, являющимися значениями полей объекта (из
которого вызывается метод). Например, если полям объекта присвоены
значения ‘A’ и ‘D’, то при вызове метода в консольное окно должны
выводиться все символы от ‘A’ до ‘D’ включительно.
*/
public class Example_2 {
    private char sim1;
    private char sim2;

    public void setSim1(char sim1) {
        this.sim1 = sim1;
    }
    public void setSim2(char sim2){
        this.sim2 = sim2;
    }
    public void showSim1AndSim2(){
        int numSim1 = (int) sim1;
        int numSim2 = (int) sim2;
        while (numSim1 <= numSim2){
            System.out.print((char)numSim1 + " ");
            numSim1++;
        }

    }
}
