package exampleLab13.examples;

public class Example_14 {
    public static void m(int x) throws ArithmeticException{
        int h = 10 / x;
    }
    public static void main(String[] args) {
        try {
            int l = args.length;
            System.out.println("Размер массив= " + l);
            m(l);
        } catch (ArithmeticException e) {
            System.out.println("Ошибка: Деление на ноль");
        }
    }
}
