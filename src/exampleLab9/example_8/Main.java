package exampleLab9.example_8;

public class Main {
    public static void main(String[] args) {
        MyList list = new MyList();
        int[] values = {1, 2, 3};

        list.createHead(values);
        System.out.println("С головы: " + list.toString());

        list.createTail(values);
        System.out.println("С хвоста: " + list.toString());

        list.AddFirst(0);
        System.out.println("AddFirst(0): " + list.toString());

        list.AddLast(4);
        System.out.println("AddLast(4): " + list.toString());

        list.Insert(9, 2);
        System.out.println("Insert(9, 2): " + list.toString());

        list.RemoveFirst();
        System.out.println("RemoveFirst: " + list.toString());

        list.RemoveLast();
        System.out.println("RemoveLast: " + list.toString());

        list.Remove(1);
        System.out.println("Remove(1): " + list.toString());

        list.createHeadRec(values);
        System.out.println("С головы рекурсивно: " + list.toString());

        list.createTailRec(values);
        System.out.println("С хвоста рекурсивно: " + list.toString());

        System.out.println("Рекурсивный вывод: " + list.toStringRec());
    }
}
