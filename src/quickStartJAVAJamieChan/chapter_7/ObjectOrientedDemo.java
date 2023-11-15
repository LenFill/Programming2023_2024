package quickStartJAVAJamieChan.chapter_7;

import quickStartJAVAJamieChan.chapter_7.objectOrientedDemo.Staff;

public class ObjectOrientedDemo {
    public static void main(String[] args) {
        Staff staff1 =new Staff("Peter");// используем первый конструктор Staff для создания экземпляра.
        staff1.setHoursWorked(160); // исползован set-метод для присвоения значения HoursWorked.
        // после того как объект staff1 создан, мы можем использоват "точку " после имени объекта
        // для обращению к любому открытому полю или методу класса. Оператор "точка" всегда используется для обращения к
        // полю или методу из другого класса.
        // Если вы обращаетесь к полю или методу из класса где они созданы "точка" не нужна.
        int pay = staff1.calculatePay(1000, 400);// тут используется второй метод calculatePay и п
        // и передаются значения 1000 и 400. эти значения присваиваются bonus и allowance
        // Переданные значения называются аргументами.
        System.out.println("Pay = " + pay);
    }
}
