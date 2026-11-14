package exampleLab11;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class Example_6 {
    static void main(String[] args) {
        List<Integer> integers = new ArrayList<>();
        Random random = new Random();
        System.out.println("\n" + "Список до: " + "\n");
        for(int i = 0; i < 5; i++ ){
            integers.add(random.nextInt(99));
            System.out.println(integers.get(i));
        }

        List<Integer> integersAfter = filterDivisibleNumbers(integers, 2);
        System.out.println("\n" + "Список после деления нацело" + "\n");

        for (Integer i: integersAfter){
            System.out.println(i);
        }
    }
    public static List<Integer> filterDivisibleNumbers(List<Integer> list, int divisor) {
        return list.stream().filter(x -> x % divisor == 0).collect(Collectors.toList());
    }
}
