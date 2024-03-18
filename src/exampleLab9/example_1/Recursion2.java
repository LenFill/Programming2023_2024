package exampleLab9.example_1;

public class Recursion2 {
    public static void m1(int x){
        if ((2* x + 1)< 30){
            m1(2* x + 1);
        }
        System.out.println("x= " + x);
    }
}
