package exampleLab7.example_4;

public class SubSubClass extends SubClass{
    public int num;
    public SubSubClass(char sim, String str, int num) {
        super(sim, str);
        this.num = num;
    }
    public SubSubClass createSubSubClass(char sim, String str, int num) {
        super.createSubClass(sim, str);
        SubSubClass copySubSubClass = new SubSubClass(sim,str,num);
        copySubSubClass.num = this.num;
        return copySubSubClass;
    }
    public void getPrint() {
        super.getPrint();
        System.out.println("Третий параметр num: " + num);
    }
}
