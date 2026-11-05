//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Node head = new Node(0, null);
        Node tail = head;

        for (int i = 1; i < 10; i++) {
            tail.next = new Node(i, null);
            tail = tail.next;
        }

        Node ref = head;
        while (ref != null) {
            System.out.print(ref.value + " ");
            ref = ref.next;
        }
    }
}