package exampleLab9.example_1;

public class Recursion5 {
    public static int fact1(int n) {
        System.out.print(n);
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return fact1(n - 2) + fact1(n - 1);
        }
    }
}
