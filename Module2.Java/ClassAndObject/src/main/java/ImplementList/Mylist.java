package ImplementList;

import java.util.Arrays;

public class Mylist <E> {

    private int size =0;
    private int DEFAULT_CAPACITY =5;
    public Object [] elements = new Object[DEFAULT_CAPACITY];

    public Mylist() {
        elements = new Object[DEFAULT_CAPACITY];
    }
    public void ensureCapa (){
        int newSize = elements.length*2;
        elements = Arrays.copyOf(elements,newSize);
    }
    public void add (E e){
        if (size>=elements.length) {
            ensureCapa();
        }
        elements[size++]= e;
    }
   public void add (E e,int index){
        if (index>=0&&index<size){
            size++;
            ensureCapa();
            for (int i = size;i>=index;i--){
                elements[i]=elements[i-1];
            }
            elements[index]=e;
        }
   }
//   Hàm này đẩy lui sau
    public void clear (){
        size = 0;
        for (int i = 0; i< elements.length;i++){
            elements[i]=null;
        }
    }
    public void remove (int index){
        if (index>=0&&index<size){
            for (int i = index; i <size-1;i++){
                elements[i] = elements[i+1];
            }
            size--;
        }
    }
    public E get (int index){
        if (index>=size||index<0) throw new IndexOutOfBoundsException("Index:"+index+"Size:"+this.size);
        return (E) elements[index];
    }
    public E getData (){
        return (E) this.elements;
    }
    public int size (){
        return this.size;
    }
    public boolean contains(E e){
        for (int i = 0; i<size;i++){
            if (elements[i].equals(e)){
               return true;
            }
        }
        return false;
    }
    public Mylist<E> newArr(){
        Mylist<E> clone = new Mylist<>();
        clone.elements = Arrays.copyOf(this.elements,this.size);
        clone.size=this.size;
        return clone;
    }
    public void indexOf (E e){
        int flag = -1;
        for (int i = 0; i <size;i++){
           if (e.equals(elements[i])){
               System.out.println("Value:"+elements[i]+"Index:"+i);
               flag=1;
           }
        }
        if (flag==-1){
            System.out.println("It's not exist!");
        }
    }
    @Override
    public String toString() {
        String arr = "[";
        for (int i = 0; i<size;i++){
            if (i==size-1){
                arr+= elements[i]+"]";
                break;
            }
            arr += elements[i]+",";
        }
        return arr;
    }
}

