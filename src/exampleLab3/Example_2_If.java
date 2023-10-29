package exampleLab3;
/*
Напишите программу, в которой пользователю предлагается ввести название дня недели.
По введенному названию программа определяет порядковый номер дня в неделе.
Если пользователь вводит неправильное название дня, программа выводит сообщение о том, что такого дня нет.
Предложите версию программы на основе вложенных условных операторов. */
import java.util.Scanner;

public class Example_2_If {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите день недели:  ");
        String dey = in.nextLine();
        if (dey.equals("Понедельник"))
            System.out.println(1);
        else if (dey.equals("Вторник"))
            System.out.println(2);
        else if (dey.equals("Среда"))
            System.out.println(3);
        else if (dey.equals("Четверг"))
            System.out.println(4);
        else if (dey.equals("Пятница"))
            System.out.println(5);
        else if (dey.equals("Суббота"))
            System.out.println(6);
        else if (dey.equals("Воскресенье"))
            System.out.println(7);
        else
            System.out.println("Вы ввели неверный день недели");
        in.close();


    }
}
