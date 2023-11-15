package quickStartJAVAJamieChan.chapter_7.objectOrientedDemo;

public class Staff {
    // Поле - это переменная, объявленная внутри класса.
    private String nameOfStaff;
    private final int hourIyRate = 30;// Ключевое слово final означает, что значение не может быть изменено после создания.
    //Любая переменная объявленная с КС final должна быть инициализирована в точке создания.
    private int hoursWorked;
    //Метод представляет блок кода для выполнения некоторой задачи
    public  void printMessage(){
        System.out.println("Calculating Pay...");
    }
    public int calculatePay() //объявление метода. int - означает, что метод возвращает зание относящееся к типу инт

    {
        printMessage();// Вызов метода printMassage. Эта команад выводит результат вызванного метода
        int staffPay; // Объявлена локальная переменная
        staffPay = hoursWorked * hourIyRate; // Присваивает произвидениен приватных полей;
        if (hoursWorked > 0)
            return staffPay;
        else
            return -1;
    }
    /* метод может обращатся ко всем полям объявленых внутри класса. Кроме того он может объявлять собственные локальные переменные
Эти переменные существуют только в рамках метода
В java можно создать 2 одномиенного метода но они должны обладать разными сигрантурами - это называется перегрузкой
Сигнатура метода - это сочитание имени метода и его параметров
*/
    public int calculatePay( int bonus, int allowance){
        printMessage();
        if (hoursWorked > 0)
            return hoursWorked * hourIyRate + bonus + allowance;
        else
            return 0;

    }
    /*
    Сигнатура первого метода calculatePay()
    Сигнатура второго метода calculatePay(int bonus,int allowance)
    */

    // Get - и Set-методы//
    // Если я правильно понял, они используются для того, что-бы через них обращатся к приватным полям.
    // Эти методы имеют представляют более высокую степень контроля.
    // пример****
    public void setHoursWorked(int hours){ // Объявляем set-метод
        if (hours > 0)
            hoursWorked = hours;
        else
        {
            System.out.println("Error: HoursWorked Cannot be Smaller than Zero");
            System.out.println("Error: HoursWorked is not updated");
        }
    }
    // get-метод
    public int getHoursWorked(){
        return hoursWorked;
    }
// 7.2.3. Конструкторы
    /*Конструктор это блок кода, который используется для конструирования объекта(схож с методом)
Имя конструктора всегда совпадает с именем класса и он используется для инициализации полей класса.
Главная особенность в том, что он становится первым блоком кода который вызывается при создании объекта нашего класса
Конструктор не возвращает значение и при его объявлении можно не использовать Void
    */
    public Staff(String name){
        nameOfStaff = name;
        System.out.println("\n" + nameOfStaff);
        System.out.println("------------------------");
    }
    // Можно создать несколько конструкторов с одним иминем, главное указать разные параметры.
    public Staff(String fitstName, String lastName){
        nameOfStaff = fitstName + " " + lastName;
        System.out.println("\n" + nameOfStaff);
        System.out.println("------------------------");
    }
    // Объявлять конструктор не обязательно. NetBeans автоматически сгенерирует  конструктор по умолчанию.




}
