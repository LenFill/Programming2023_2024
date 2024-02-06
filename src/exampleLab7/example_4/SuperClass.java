package exampleLab7.example_4;

public class SuperClass {
    public char sim;
    SuperClass(){
        System.out.println("Конструктор ез параметра");
    }
    SuperClass(char sim){
        this.sim = sim;
    }
    public void getPrint(){
        System.out.println("Первый параметр sim: " + sim);
    }
    public SuperClass createSuperClass(char sim){
        SuperClass copySuperClass = new SuperClass(sim);
        copySuperClass.sim = this.sim;
        return copySuperClass;
    }
}
