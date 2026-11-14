package exampleLab11;

import java.util.List;
import java.util.stream.Collectors;

public class Example_9 {
    static void main(String[] args) {
        String string = "Книга Дом123 Стол Привет! Машина 2026";

        List<String> strings = List.of(string.split(" "));
        System.out.println("\n" + "Исходный список : " + "\n");
        for (String e : strings) {
            System.out.println(e);
        }

        List<String> stringsAfter = filterOnlyLetters(strings);

        System.out.println("\n" + "Строки, содержащие только буквы : " + "\n");
        for(String e : stringsAfter) {
            System.out.println(e);
        }
    }
    public static List<String> filterOnlyLetters(List<String> list) {
        return list.stream()
                .filter(s -> s.matches("\\p{L}+"))
                .collect(Collectors.toList());
    }
}
