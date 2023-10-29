package exampleLab3;
/*
Напишите программу, в которой пользователю предлагается ввести название дня недели.
По введенному названию программа определяет порядковый номер дня в неделе.
Если пользователь вводит неправильное название дня, программа выводит сообщение о том, что такого дня нет.
 Предложите версию программы на основе оператора выбора switch.
 */
import java.util.Scanner;

public class Example_2_Switch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите день недели:  ");
        String dey = in.nextLine();
        switch (dey){
            case "Понедельник":
                System.out.println(1);
                break;
            case "Вторник":
                System.out.println(2);
                break;
            case "Среда":
                System.out.println(3);
                break;
            case "Четверг":
                System.out.println(4);
                break;
            case "Пятница":
                System.out.println(5);
                break;
            case "Суббота":
                System.out.println(6);
                break;
            case "Воскресенье":
                System.out.println(7);
                break;
            default:
                System.out.println("Такого дня нет. Возможно вы допустили ошибку.");
        }
        in.close();

    }
}
