package exampleLab9.example_1;
/*
. Создать приложения для демонстрации примеров 1 – 5 из раздела 1.
Для примера 5 дополнительно вывести в консоль последовательность
обхода дерева рекурсивных вызовов.
 */

public class Main {
    public static void main(String[] args) {
        System.out.println("Первый пример");
        Recursion1.m(2);
        System.out.println("Второй пример");
        Recursion2.m1(4);
        System.out.println("Третий пример");
        Recursion3.m2(3);
        System.out.println("Четвертый пример");
        System.out.println(Recursion4.fact(5));
        System.out.println("Пятый пример");
        System.out.println(Recursion5.fact1(5));
    }
}
