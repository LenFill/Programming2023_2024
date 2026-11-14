package exampleLab13.examples;

public class Example_13 {
    static void main(String[] args) {
        try {
            int l = args.length;
            System.out.println("Размер массива= " + l);
            int h = 10 / l;
            args[l + 1] = "10";
        } catch (ArithmeticException e) {
            System.out.println("Деление на ноль");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Индекс не существует");
        }
    }
}
