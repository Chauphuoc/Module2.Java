package LinkedListExampleJames;


import ArrayListExampleJames.Mylist;

import java.util.Arrays;
import java.util.Objects;

public class MyLinkedList {
    Node head;
    int numberNode;
    public MyLinkedList(){}

    public MyLinkedList(int numberNode) {
        this.numberNode = numberNode;
    }

    public void addFirst (Object a){
       Node temp = head;
       head = new Node<>(a);
       head.next=temp;
    }

    public void addLast (Object value){
        Node newNode = new Node(value);
        Node lastNode = head;
        while (lastNode.next!=null){
            lastNode=lastNode.next;
        }
        lastNode.next=newNode;
    }

    public void remove (int index){
        Node currentNode = head;
        Node previousNode = null;
        int count = 0;
        while (currentNode!=null){
            previousNode=currentNode;
            currentNode=currentNode.next;
            count++;
            if (count==index){
                previousNode.next=currentNode.next;
                currentNode.next=null;
                break;
            }
        }
    }

    public boolean remove (Object value){
        Node currentNode = head;
        Node previousNode = null;
        boolean flag = false;
        while (currentNode!=null){
            if (value==currentNode.value){
                previousNode.next=currentNode.next;
                currentNode.next=null;
                flag=true;
                break;
            }
            previousNode=currentNode;
            currentNode=currentNode.next;
        }
        return flag;
    }

    public int size (){
        Node temp=head;
        int count = 0;
        while (temp!=null){
            count++;
            temp=temp.next;
        }
        return count;
    }

    public boolean contains(Object data){
        Node temp = head;
        boolean flag = false;
        while (temp!=null){
            if ((temp.value).equals(data)) {
                flag=true;
                break;
            }
            temp=temp.next;
        }
        return flag;
    }

    public int indexOf(Object data){
        Node temp = head;
        int count = 0;
        while (temp!=null){
            if (temp.value.equals(data)){
                break;
            }
            temp=temp.next;
            count++;
        }
        return count;
    }

    public MyLinkedList clonelist (){
        Node temp = head;
        MyLinkedList newLinkedList = new MyLinkedList();
        newLinkedList.addFirst(new Node(temp.value));
        temp=temp.next;
        while (temp!=null){
            newLinkedList.addLast(new Node(temp.value));
            temp=temp.next;
        }
        return newLinkedList;
    }
    public void printing(){

       Node temp = head;
       if (temp==null){
           System.out.println("List is empty");
       }
       else {
           while (temp!=null){
               System.out.println(temp.value);
               temp=temp.next;
           }
       }
    }

    public Object getFirst (){
        Node temp = head;
        if (temp==null){
            return null;
        }
        else {
            return temp.value;
        }
    }

    public Object getLast(){
        Node temp = head;
        if (temp==null){
            return null;
        }
        else {
            while (temp.next!=null){
                temp=temp.next;
            }
            return temp.value;
        }
    }

    public Object get (int index){
        Node temp = head;
        int count = 0;
        boolean flag = false;
        if (temp==null){
            return null;
        }
        else {
            while (temp!=null){
                if (count==index){
                    flag=true;
                    break;
                }
                temp=temp.next;
                count++;
            }
        }
        if (flag==true){
            return temp.value;
        }
        else return 0;
    }
    public static void main(String[] args) {
        MyLinkedList test1 = new MyLinkedList();
        test1.addFirst(3);
        test1.addFirst(5);
        test1.addFirst(10);
        test1.addLast("hello");
        test1.printing();
        test1.contains(3);
        System.out.println("Index:"+test1.indexOf(3));
        System.out.println(test1.getFirst());
        System.out.println(test1.getLast());
        System.out.println(test1.get(1));
//        test1.remove(1);
//        System.out.println(test1.remove("hello"));
//        test1.printing();
//        System.out.println("Size is:" + test1.size());
//        System.out.println(test1.indexOf(10));

    }

}
