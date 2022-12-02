package ImplementList.StackExampleJames;

import LinkedListExampleJames.MyLinkedList;

import java.util.LinkedList;

public class MyGenericStack <E> {
    private LinkedList <E> mylist ;
    public MyGenericStack(){
        mylist = new LinkedList<>();
    }

    public MyGenericStack(LinkedList<E> mylist) {
        this.mylist = mylist;
    }
    public void push (E element){
        mylist.push(element);
    }
    public E pop(){
        return mylist.pop();
    }
    public E peak(){
        return mylist.peek();
    }
    public int size (){
        return mylist.size();
    }
    public boolean isEmpty (){
        return mylist.isEmpty();
    }
}
