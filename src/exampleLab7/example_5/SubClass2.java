package exampleLab7.example_5;

public class SubClass2 extends SuperClass{
    private char sim;
    public char getSim(){
        return sim;
    }
    public SubClass2 (String str, char sim){
        super(str);
        this.sim = sim;
    }
    @Override
    public void showInfo(){
        super.showInfo();
        System.out.println(" sim = " + this.getSim());
    }
}
