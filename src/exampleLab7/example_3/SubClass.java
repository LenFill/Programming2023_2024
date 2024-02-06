package exampleLab7.example_3;

public class SubClass extends SuperClass{
    public char sim; //открытое символьное поле
    public void setValues(int num, char sim, String str1) {
        super.setValues(num);
        this.sim = sim;
    }
    @Override
    public void setValues(int num, char sim){//метод с двум параметрами num и sim
        super.setValues(num);
        this.sim = sim;
    }
    SubClass(int num, char sim){
        super(num);
        this.sim = sim;
        System.out.println("Первый параметр num равен: " + num +"\n" +
                "Второй параметр sim равен: " + sim);
    }
    SubClass(){
        System.out.println("В конструкторе нет параметров");
    }
    @Override
    public String toString() {
        return "SubClass{" +
                "num = " + num + "" +
                "sim = " + sim +
        '}';
    }
}
