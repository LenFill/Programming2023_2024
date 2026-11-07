package exampleLab9.example_6;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(0, "Кот");
        map.put(1, "Собака");
        map.put(2, "Дом");
        map.put(3, "Машина");
        map.put(4, "Лес");
        map.put(5, "Книга");
        map.put(6, "Телефон");
        map.put(7, "Стол");
        map.put(8, "Компьютер");
        map.put(9, "Окно");

        System.out.println("Строки с ключом больше 5:");
        for (int key : map.keySet()){
            if (key > 5){
                System.out.println(key + ": " + map.get(key));
            }
        }
        if (map.containsKey(0)){
            System.out.println("Все строки через запятую:");
            System.out.println(String.join(", ", map.values()));
        }

        int product = 1;
        for(int key: map.keySet()){
            if (map.get(key).length()> 5){
                product *= key;
            }
        }
        System.out.println("Произведение ключей: " + product);
    }
}
