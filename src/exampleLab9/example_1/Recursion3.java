package exampleLab9.example_1;

public class Recursion3 {
    private static int step = 8;
    public static void m2(int x){
        space();
        System.out.println("" + x+ "-> ");
        step++;
        if ((2 * x + 1)< 20){
            m2(2 * x + 1);
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
}
