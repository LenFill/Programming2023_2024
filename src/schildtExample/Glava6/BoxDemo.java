package schildtExample.Glava6;

class Box{
    double width;
    double height;
    double depth;

}
// В этом классе объявляется объект типа Box.
class BoxDemo {
    public static void main(String[] args) {
        Box mybox = new Box();
        double vol;
        //присвоить значения переменным экземпляра mybox.
        mybox.width = 10;
        mybox.depth = 15;
        mybox.height = 20;
        //Вычисли объем коробки.
        vol = mybox.width * mybox.height* mybox.depth;
        System.out.println("Объем равен " + vol);
    }
}
