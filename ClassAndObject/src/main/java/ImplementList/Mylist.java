package ImplementList;

import java.util.Arrays;

public class Mylist <E> {
    private int size =0;
    private int DEFAULT_CAPACITY =10;
    private Object [] elements = new Object[DEFAULT_CAPACITY];

    public Mylist() {
        elements = new Object[DEFAULT_CAPACITY];
    }
    public void ensureCaoal (){
        int newSize = elements.length*2;
        elements = Arrays.copyOf(elements,newSize);
    }
    public void add (E element){
        if (size== elements.length){
            ensureCaoal();
        }
        else elements[size++]=element;
    }
    public E get (int i){
        if (i>=size||i<0){
            throw new IndexOutOfBoundsException("Index:"+i+"Size"+size+"Length"+elements.length);
        }
        return (E) elements[i];
    }
}
