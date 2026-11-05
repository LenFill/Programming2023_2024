package exampleLab9.example_2;

public class BitRecursion {
    public static void BitRec(int x) {
        if (x > 1) {
            BitRec(x / 2);
        }
        System.out.print(x % 2);
    }

}
