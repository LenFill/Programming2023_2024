package exampleLab4;
/*
Напишите программу, которая выводит в консольное окно
прямоугольный треугольник;

 */
public class Example_2 {
    public static void main(String[] args) {
        int figure = 9;
        int i, j , z;
        for (i = 1 ; i <= figure; i++) {
            System.out.print("Номер строки: " + i + " ");
            z = 0;
            for (j = 0; j < i; j++) {
                System.out.print("+");
                z = z + 1;
            }
            System.out.println(" Количество символов в строке " + z);
        }
    }
}
