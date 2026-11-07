package exampleLab9.example_7;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите кличество людей ");
        int n = in.nextInt();
        ArrayList<Integer> people = new  ArrayList<>();
        for (int i = 1; i<= n; i++){
            people.add(i);
        }
        long start = System.nanoTime();
        while (people.size() > 1){
            people.add(people.remove(0));
            people.remove(0);
        }
        long time = System.nanoTime() - start;
        System.out.println("Остался человек № " + people.get(0));
        System.out.println("Время: " + time + " нс");

    }
}
