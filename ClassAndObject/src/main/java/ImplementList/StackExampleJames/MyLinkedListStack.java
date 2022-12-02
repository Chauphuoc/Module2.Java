package ImplementList.StackExampleJames;

import LinkedListExampleJames.MyLinkedList;

import java.util.ArrayList;

public class MyLinkedListStack implements MyStackandQueue {
    Node head;
    int numberNode;


    @Override
    public boolean push(int value) {
        if (!isFull()){
            Node temp = head;
            head = new Node(value);
            head.next=temp;
            return true;
        }
        return false;
    }

    @Override
    public int pop() {
        if (isEmpty()){
            return -1;
        }
        else {
            int value = head.data;
            head = head.next;
            return value;
        }
    }

    @Override
    public boolean isFull() {
        return false;
    }

    @Override
    public boolean isEmpty() {
        return head==null;
    }

    @Override
    public void priting() {
        if (isEmpty()){
            System.out.println("List is empty");
            return;
        }
        else {
            Node temp = head;
            ArrayList<Integer> arr = new ArrayList<Integer>();
            while (temp!=null){
                arr.add(temp.data);
//                System.out.print(temp.data+" ");
                temp=temp.next;
            }
            for (int i = arr.size()-1;i>=0;i--){
                System.out.print(arr.get(i)+" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        MyLinkedListStack test1 = new MyLinkedListStack();
        test1.push(1);
        test1.push(2);
        test1.push(3);
        test1.push(4);
        test1.priting();

        test1.pop();
        test1.priting();
        test1.pop();
        test1.priting();
        test1.pop();
        test1.priting();
        test1.pop();
        test1.priting();
    }
}
