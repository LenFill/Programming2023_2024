package exampleLab10.example_7;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Iterator;
import java.util.Scanner;

public class JsonParser {
    public static void main(String[] args) {
        try{
            String filePath = "src/exampleLab10/example_7/birthdays.json";
            JSONParser parser = new JSONParser();
            Object obj = parser.parse(new FileReader(filePath));
            JSONObject jsonObject = (JSONObject) obj;
            System.out.println("Корневой элемент: " + jsonObject.keySet().iterator().next());
            JSONArray jsonArray = (JSONArray) jsonObject.get("birthdays");
            Scanner in = new Scanner(System.in);

            while(true){
                System.out.println("\n1. Показать все записи");
                System.out.println("2. Добавить человека");
                System.out.println("3. Поиск по имени");
                System.out.println("4. Удалить человека");
                System.out.println("0. Выход");
                System.out.print("Выберите действие: ");
                switch (in.nextLine()){
                    case "1" -> showAll(jsonArray);
                    case "2" -> {
                        addPerson(jsonArray, in);
                        save(jsonObject, filePath);
                        System.out.println("Человек добавлен в JSON-файл.");
                    }
                    case "3" -> searchPerson(jsonArray, in);
                    case "4" -> {
                        if (removePerson(jsonArray, in)) {
                            save(jsonObject, filePath);
                            System.out.println("Человек удалён из JSON-файла.");
                        } else {
                            System.out.println("Человек не найден.");
                        }
                    }
                    case "0" -> {
                        return;
                    }
                    default -> System.out.println("Неизвестная команда.");
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    private static void showAll(JSONArray jsonArray) {
        for (Object o : jsonArray) {
            printPerson((JSONObject) o);
        }
    }
    private static void printPerson(JSONObject person) {
        System.out.println("Имя: " + person.get("name"));
        System.out.println("Дата рождения: " + person.get("date"));
    }
    private static void addPerson(JSONArray jsonArray, Scanner in) {
        System.out.println("Введите имя: ");
        String name = in.nextLine();
        System.out.println("Введите дату рождения (дд.мм.гггг)");
        String date = in.nextLine();
        JSONObject newPerson = new JSONObject();
        newPerson.put("name", name);
        newPerson.put("date", date);
        jsonArray.add(newPerson);
    }
    private static boolean removePerson(JSONArray jsonArray, Scanner in) {
        System.out.print("Введите имя человека для удаления: ");
        String deleteName = in.nextLine();
        Iterator iterator = jsonArray.iterator();
        while (iterator.hasNext()){
            JSONObject person = (JSONObject) iterator.next();
            String name = (String) person.get("name");
            if(name.equalsIgnoreCase(deleteName)){
                iterator.remove();
                return  true;
            }
        }
        return false;
    }
    private static void save(JSONObject jsonObject, String filePath) throws IOException{
            try (FileWriter file = new FileWriter(filePath);){
                file.write(jsonObject.toJSONString());
            }
        }
    private static void searchPerson(JSONArray jsonArray, Scanner in){
        System.out.println("Введите имя для поиска: ");
        String search = in.nextLine();
        jsonArray.stream().filter(o -> {
            JSONObject person = (JSONObject) o;
            String name = (String) person.get("name");
            return name.equalsIgnoreCase(search);
        })
                .forEach(o -> printPerson((JSONObject) o));
    }
}
