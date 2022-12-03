package LinkedListExampleJames;

public class Node <E> {
    public Node next;
    public Object value;

    public Node(Object value) {
        this.value = value;
    }
    public Object getValue (){
        return this.value;
    }
}
