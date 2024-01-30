package exampleLab6.example_7;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        char[] array = {'f', 'e', 'g', 'a'};
        System.out.println("Символьный массив: " + Arrays.toString(array));
        System.out.println("Числовой массив на основе символного: " + Arrays.toString(Example_7.charArray(array)));
    }
}
