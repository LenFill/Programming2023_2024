package exampleLab13.examples;

public class Example_9 {
    static int m() {
        try {
            System.out.println("0");
            return 55;
        } finally {
            System.out.println("1");
        }
    }
    static void main(String[] args) {
        System.out.println(m());
    }
}
