package exampleLab9.example_1;

public class Recursion1 {
    public static void m(int x){
        System.out.println("x= " + x);
        if ((2* x + 1)< 30){
            m(2* x + 1);
        }
    }
}
