package exempl_Lab1;

public class example_3 {
    public static void main(String[] args) {
        int s, d;
        s = 10;
        d = 20;
        if (s < d) {
            System.out.println("S < D");
        }
        s = s * 2;
        if (s == d) {
            System.out.println("S = D");
        }
        s = s * d;
        if (s < d) {
            System.out.println("S < D");
        }
    }
}
