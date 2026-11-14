package exampleLab12;

public class Example_4 {
    static void main(String[] args) {
        for (int i = 1; i <= 10; i++){
            Thread t = new Thread(() ->{
                System.out.println(Thread.currentThread().getName());
            });
            t.setName("Поток № " + i);
            t.start();
        }
    }
}
