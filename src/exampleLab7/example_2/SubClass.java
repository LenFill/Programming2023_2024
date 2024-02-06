package exampleLab7.example_2;

public class SubClass extends SuperClass{
    public int num;
    public SubClass(String text){
        super(text);
    }
    public SubClass(String text, int num){
        super(text);
        this.num = num;
    }
    @Override
    public String getText(){
        return super.getText();
    }
    @Override
    public void setText(){
        super.setText("переопределен");
    }
    @Override
    public void setText(String text){
        super.setText("Переопределен с текстовым значением: " + text);
    }
    @Override
    public void setText(int num) {
        super.setText(num);
        this.num = num;
    }
    @Override
    public void setText(int num, String text){
        super.setText(num, text);
        this.num = num;
    }
    @Override
    public String toString() {
        return "SubClass: " + super.toString() + ", number: " + num;
    }
}
