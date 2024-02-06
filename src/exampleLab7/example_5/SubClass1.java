package exampleLab7.example_5;

public class SubClass1 extends SuperClass{
    private int num;

    public int getNum() {
        return num;
    }

    public SubClass1 (String str, int num){
        super(str);
        this.num = num;
    }
    @Override
    public void showInfo(){
        super.showInfo();
        System.out.println(" num = " + this.getNum());
    }
}
