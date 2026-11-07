package exampleLab9.example_8;

public class MyList {
    private Node head;

    public void createHead(int[] values){
        head = null;
        for (int value : values){
            AddFirst(value);
        }
    }
    public void createTail(int[] values){
        head = null;
        for(int value : values){
            AddLast(value);
        }
    }

    @Override
    public String toString(){
        String text = "";
        Node ref = head;
        while (ref != null){
            text += ref.value + " ";
            ref = ref.next;
        }
        return text.trim();
    }
    public void AddFirst(int value) {
        head = new Node(value, head);
    }
    public void AddLast(int value){
        if (head == null){
            AddFirst(value);
            return;
        }
        Node ref = head;
        while (ref.next != null){
            ref = ref.next;
        }
        ref.next = new Node(value, null);
    }
    public void Insert(int value, int index) {
        if (index == 0){
            AddFirst(value);
            return;
        }
        Node ref = head;
        for(int i = 0; i < index - 1; i++){
            ref = ref.next;
        }
        ref.next = new Node(value, ref.next);
    }
    public void RemoveFirst(){
        if (head != null) {
            head = head.next;
        }
    }
    public void RemoveLast(){
        if(head == null || head.next == null){
            head = null;
            return;
        }
        Node ref = head;
        while (ref.next.next != null){
            ref = ref.next;
        }
        ref.next = null;
    }
    public void Remove(int index){
        if (index == 0){
            RemoveFirst();
            return;
        }
        Node ref = head;
        for (int i = 0; i < index - 1; i++){
            ref = ref.next;
        }
        ref.next = ref.next.next;
    }
    public void createHeadRec(int[] values){
        head = createHeadRec(values, values.length - 1);
    }
    private Node createHeadRec(int[] values, int index){
        if (index < 0){
            return null;
        }
        return new Node(values[index], createHeadRec(values, index - 1));
    }
    public void createTailRec(int[] values) {
        head = createTailRec(values, 0);
    }

    private Node createTailRec(int[] values, int index) {
        if (index == values.length){
            return null;
        }
        return new Node(values[index], createTailRec(values, index + 1));
    }
    public String toStringRec(){
        return toStringRec(head).trim();
    }
    private String toStringRec(Node node){
        if (node == null) {
            return "";
        }
        return node.value + " " + toStringRec(node.next);
    }
}
