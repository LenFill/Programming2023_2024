package exampleLab7.example_4;

public class SubClass extends SuperClass{
    public String str;
    public SubClass(char sim, String str) {
        super(sim);
        this.str = str;
    }
    public SubClass(){
        System.out.println();
    }

    @Override
    public void getPrint() {
        super.getPrint();
        System.out.println("Второй параметр str: " + str);
    }
    public SubClass createSubClass(char sim, String str) {
        super.createSuperClass(sim);
        SubClass copySubClass = new SubClass(sim,str);
        copySubClass.str = this.str;
        return copySubClass;
    }
}
