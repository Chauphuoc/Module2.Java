package ImplementList.StackExampleJames;

public class MyLinkedListQueue implements MyStackandQueue {
    public Node head;
    public Node tail;
    public int numberNode;
    private int count;

    public MyLinkedListQueue() {
        this.head = null;
        this.tail = null;
    }
//    public void enqueue(int key){
//        Node temp = new Node(key);
//        if (this.tail == null){
//            this.head=this.tail=temp;
//            return;
//        }
//        this.tail.next =temp;
//        this.tail=temp;
//    }

    @Override
    public boolean push(int value) {
        if (isFull())
            return false;
        else {
            count++;
            if (isEmpty()) {
               head= tail = new Node(value);
            } else {
                Node lastNode = tail;
                while (lastNode.next != null) {
                    lastNode = lastNode.next;
                }
                lastNode.next = new Node(value);
            }
            return true;
        }
    }

    @Override
    public int pop() {
        if (isEmpty()){
            return -1;
        }
        else {
            int value = head.data;
            head = head.next;
            if (head==tail){
                head=tail=null;
            }
            return value;
        }
    }

    @Override
    public boolean isFull() {
        return false;
    }

    @Override
    public boolean isEmpty() {
        return head==null&&tail==null;
    }

    @Override
    public void priting() {
        if (isEmpty()){
            System.out.println("List is Empty");
            return;
        }
        else {
           Node temp = head;
           while (temp!=null){
               System.out.print(temp.data+" ");
               temp = temp.next;
               if(temp!=null){
                   System.out.print("=>");
               }
           }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        MyLinkedListQueue test1 = new MyLinkedListQueue();
        System.out.println(test1.push(1));
        System.out.println(test1.push(2));
        System.out.println(test1.push(3));
        System.out.println(test1.push(4));
        test1.priting();

        System.out.println(test1.pop());
        test1.priting();


    }
}
