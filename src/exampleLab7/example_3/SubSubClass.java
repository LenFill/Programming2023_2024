package exampleLab7.example_3;

public class SubSubClass extends SubClass{
    public String str1; //открытое текстовое поле
    @Override
    public void setValues(int num, char sim, String str1){ //преопределенный метод с 3-мя параметрами
        super.setValues(num, sim);
        this.str1 = str1;
    }
    SubSubClass(int num, char sim, String str1){ //Конструктор с 3-мя параметрами
        super(num, sim);
        this.str1 = str1;
        System.out.println("Первый параметр num равен: " + num +"\n" +
                "Второй параметр sim равен: " + sim +"\n" +
                "Третий параметр str1 равен: " + str1);
    }
    SubSubClass(){
        System.out.println("Конструктор без параметров");
    }
    @Override
    public String toString() {
        return "SubClass{" +
                "num = " + num + "" +
                "sim = " + sim + "" +
                "str1 = " + str1 +
                '}';
    }
}
