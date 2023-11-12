package exampleLab4;
import java.util.Arrays;
import java.util.Scanner;
/*
Напишите программу «Шифр Цезаря», которая зашифровывает
введенный текст. Используете кодовую таблицу символов. При запуске
программы в консоль необходимо вывести сообщение: «Введите текст для
шифрования», после ввода текста, появляется сообщение: «Введите ключ».
После того как введены все данные, необходимо вывести преобразованную
строку с сообщением «Текст после преобразования : ». Далее необходимо
задать вопрос пользователю: «Выполнить обратное преобразование? (y/n)»,
если пользователь вводит «y», тогда выполнить обратное преобразование.
Если пользователь вводит «n», того программа выводит сообщение «До
свидания!». Если пользователь вводит что-то другое, отличное от «y» или «n»,
то программа ему выводит сообщение: «Введите корректный ответ».
 */
public class Example_8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите текст для шифрования(использовать только прописные буквы): ");
        String text = in.nextLine();
        System.out.print("\nВведите ключ: ");
        int key = in.nextInt();
        char[] massText = text.toCharArray();// преобразовываю введеный техт в массив
        int idText = massText.length;
        String alfavit = "абвгдеёжзийклмнопрстуфхцчшщъыьэюя";
        char[] numer = alfavit.toCharArray(); //задаю массив алфавита
        char[] result = new char[massText.length];
        for (int i =0; i < idText; i++ ){
            int index = Arrays.binarySearch(numer,massText[i] );
            index = index + key;
            result [i] = numer[index];
        }
        String res = new String(result);
        System.out.println("Текст после преобразования: " + res);
        System.out.println("Выполнить обратное преобразование? (y/n)");
        Scanner in1 = new Scanner(System.in);
        String yesNo = in1.nextLine();
        if (yesNo.equals("y")){
            char[] revResult = new char[massText.length];
            for (int i =0; i < idText; i++ ) {
                int index = Arrays.binarySearch(numer, result[i]);
                index = index - key;
                revResult[i] = numer[index];
            }
            String revRes = new String(revResult);
            System.out.println("Текст после обратного преобразования: " + revRes);
        } else if (yesNo.equals("n")) {
            System.out.println("До свидания!");
        } else {
            System.out.println("Введите корректный ответ");
        }
    }
}
