package exampleLab7.example_3;

public class SuperClass {
    public int num; // открытое целочисленное поле
    public void setValues(int num) { //метод с одним параметром для присвоения значения полю
        this.num = num;
    }
    public void setValues(int num, char sim){ //пришлось создать метод с 2-мя параметра для переопределения в производном классе.
        this.num = num;
    }
    SuperClass( int num){ // Конструктор с одним параметром
        this.num = num;
        System.out.println("Параметр num равен: " + num);
    }
    SuperClass(){//Пришлось создавать конструктор без параметров для исправлени ошибки
        System.out.println("Конструктор без параметров");
    }
    @Override
    public String toString() {
        return "SuperClass{" +
                "num = " + num +
                '}';
    }
}
