package exampleLab9.example_2;

public class BitRecursion {
    public static int BitRec(int x){
        int ostatok;
        if(x ==1){
            return 1;
        } else{
            ostatok = x % 2;
            System.out.print(ostatok);
            return BitRec(x / 2);
        }
    }

}
