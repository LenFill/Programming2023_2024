package exampleLab11;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class Example_10 {
    static void main(String[] args) {
        List<Integer> integers = new ArrayList<>();
        Random random = new Random();
        System.out.println("\n" + "Список до: " + "\n");
        for (int i = 0; i < 5; i++) {
            integers.add(random.nextInt(100));
            System.out.println(integers.get(i));
        }
        List<Integer> integersAfter = filterLessNumbers(integers, 50);
        System.out.println("\n" + "Список чисел меньше заданного значения" + "\n");
        for (Integer i : integersAfter) {
            System.out.println(i);
        }
    }
    public static List<Integer> filterLessNumbers(List<Integer> list, int limit) {
        return list.stream().filter(x -> x < limit).collect(Collectors.toList());
    }
}

