package exampleLab9.examples.example_3;

public class Recursion {
    private static int step = 8;
    public static void m(int x){
        space();
        System.out.println("" + x+ "-> ");
        step++;
        if ((2 * x + 1)< 20){
            m(2 * x + 1);
        }
        step--;
        space();
        System.out.println("" + x+ "<- ");
    }
    public static void space(){
        for (int i = 0; i<step; i++){
            System.out.print(" ");
        }
    }
    public static void main(String[] args) {
        m(1);
    }
}
