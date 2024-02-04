package exampleLab7.example_2;

public class SuperClass {
    private String text;
    public SuperClass(String text){
        this.text = text;
    }
    public SuperClass(){
    }
    public void setText(){
        this.text = "По умолчанию";
    }
    public void setText(String text){
        this.text = text;
    }
    public void setText(int num) {
        this.text = String.valueOf(num);
    }
    public void setText(int num, String text){
        this.text = num + text;
    }
    public String getText(){
        return text;
    }
    public void setConstValue(){
        this.text = "Присвоилил константу";
    }
    public int getNum(){
        if (null == this.text){
            return 0;
        }
        return this.text.length();
    }
    @Override
    public String toString(){
        return "SuperClass: " + text;
    }

}
