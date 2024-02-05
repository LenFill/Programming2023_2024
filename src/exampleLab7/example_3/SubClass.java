package exampleLab7.example_3;

public class SubClass extends SuperClass{

    public char sim; //открытое символьное поле

    @Override
    public void setValues(int num, char sim){//метод с двум параметрами num и sim
        super.setValues(num);
        this.sim = sim;
    }
    SubClass(int num, char sim){
        super(num);
        System.out.println(num + sim);
    }
    SubClass(){

    }


}
