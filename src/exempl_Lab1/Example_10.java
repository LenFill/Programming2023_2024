package exempl_Lab1;
import java.time.YearMonth;
public class Example_10 {
    public static void main(String[] args) {
        int yearOfBirth = 1998;
        int year = YearMonth.now().getYear(); // использовал методы now().getYear() класса YearMonth который выводит целочисленное значение текущего года
        System.out.printf("You are %d years old", (year-yearOfBirth));

    }
}
