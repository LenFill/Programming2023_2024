package exampleLab7.example_5;

public class SuperClass {
    private String str;

    public String getStr() {
        return str;
    }

    public void showInfo(){
        System.out.println("super" + "\n" +
                " Class name: " + this.getClass().getSimpleName() + "\n" +
                " str = " + this.getStr());
    }
    public SuperClass (String str){
        this.str = str;
    }
    public SuperClass(){
        System.out.println("В конструкторе нет параметров");
    }


}
