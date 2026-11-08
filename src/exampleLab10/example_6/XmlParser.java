package exampleLab10.example_6;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;
import java.util.Scanner;
import java.util.stream.IntStream;

public class XmlParser {
    static void main(String[] args) {
        try {
            File inputFile = new File("src/exampleLab10/example_6/birthdays.xml");
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(inputFile);
            doc.getDocumentElement().normalize();
            Scanner in = new Scanner(System.in);
            while(true){
                System.out.println("\n1. Показать все записи");
                System.out.println("2. Добавить человека");
                System.out.println("3. Поиск по имени или году рождения");
                System.out.println("4. Удалить человека");
                System.out.println("0. Выход");
                System.out.print("Выберите действие: ");
                switch (in.nextLine()){
                    case "1" -> showAll(doc);
                    case "2" -> {
                        addPerson(doc, in);
                        save(doc, inputFile);
                        System.out.println("Человек добавлен в XML-файл.");
                    }
                    case "3" -> searchPerson(doc, in);
                    case "4" -> {
                        if (removePerson(doc, in)) {
                            save(doc, inputFile);
                            System.out.println("Человек удалён из XML-файла.");
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
    private static void showAll(Document doc){
        NodeList nodeList = doc.getElementsByTagName("person");
        for (int i = 0; i < nodeList.getLength(); i++) {
            Node node = nodeList.item(i);
            System.out.println("\nТекущий элемент: " + node.getNodeName());
            if (node.getNodeType() == Node.ELEMENT_NODE) {
                Element element = (Element) node;
                System.out.println("Имя: "
                        + element.getElementsByTagName("name").item(0).getTextContent());
                System.out.println("Дата рождения: "
                        + element.getElementsByTagName("date").item(0).getTextContent());
            }
        }
    }
    public static void addPerson(Document doc, Scanner in){
        System.out.println("Введите имя: ");
        String newName = in.nextLine();
        System.out.println("Введите дату рождения(дд.мм.гггг)");
        String newDate = in.nextLine();
        Element newPerson = doc.createElement("person");
        Element nameElement = doc.createElement("name");
        nameElement.setTextContent(newName);
        newPerson.appendChild(nameElement);
        Element dateElement = doc.createElement("date");
        dateElement.setTextContent(newDate);
        newPerson.appendChild(dateElement);
        doc.getDocumentElement().appendChild(newPerson);
    }
    private static void searchPerson(Document doc, Scanner in) {
        System.out.println("Введите имя или год рождения для поиска: ");
        String search = in.nextLine();
        NodeList nodeList = doc.getElementsByTagName("person");
        IntStream.range(0, nodeList.getLength())
                .mapToObj(i -> (Element) nodeList.item(i))
                .filter(person -> {
                    String name = person.getElementsByTagName("name")
                            .item(0).getTextContent();
                    String date = person.getElementsByTagName("date")
                            .item(0).getTextContent();
                    return name.equalsIgnoreCase(search)
                            || date.endsWith(search);
                })
                .forEach(person -> {
                    System.out.println("Имя: "
                            + person.getElementsByTagName("name")
                            .item(0).getTextContent());
                    System.out.println("Дата рождения: "
                            + person.getElementsByTagName("date")
                            .item(0).getTextContent());
                });
    }
    private static void save(Document doc, File inputFile) throws Exception {
        Transformer transformer = TransformerFactory.newInstance().newTransformer();
        transformer.setOutputProperty(OutputKeys.ENCODING, "UTF-8");
        transformer.setOutputProperty(OutputKeys.INDENT, "yes");
        transformer.transform(new DOMSource(doc), new StreamResult(inputFile));    }
    private static boolean removePerson(Document doc, Scanner in) {
        System.out.print("Введите имя человека для удаления: ");
        String deleteName = in.nextLine();
        NodeList nodeList = doc.getElementsByTagName("person");
        for (int i = 0; i < nodeList.getLength(); i++) {
            Element person = (Element) nodeList.item(i);
            String name = person.getElementsByTagName("name")
                    .item(0).getTextContent();
            if (name.equalsIgnoreCase(deleteName)) {
                person.getParentNode().removeChild(person);
                return true;
            }
        }
        return false;
    }
}
