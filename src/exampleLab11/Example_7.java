package exampleLab11;

import java.util.List;
import java.util.stream.Collectors;

public class Example_7 {
    static void main(String[] args) {
        String string = "Напишите функцию, Которая принимает на вход список " +
                "строк и возвращает новый список, Содержащий только те строки, " +
                "которые Начинаются с большой букыв.";

        List<String> strings = List.of(string.split(" "));
        System.out.println("\n" + "Строка после сплитования : " + "\n");
        for (String e : strings) {
            System.out.println(e);
        }

        List<String> stringsAfter = filterByLength(strings, 7);

        System.out.println("\n" + "Строка с заданной длинной : " + "\n");
        for(String e : stringsAfter) {
            System.out.println(e);
        }
    }
    public static List<String> filterByLength(List<String> list, int length) {
        return list.stream()
                .filter(s -> s.length() > length)
                .collect(Collectors.toList());
    }
}
