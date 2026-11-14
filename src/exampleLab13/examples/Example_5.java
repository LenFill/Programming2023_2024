package exampleLab13.examples;

public class Example_5 {
    static void main(String[] args) {
        try {
            System.out.println("0");
            throw new RuntimeException("Ошибка");
        } catch (RuntimeException e) {
            System.out.println("1");
        }
        System.out.println("2");
    }
}
