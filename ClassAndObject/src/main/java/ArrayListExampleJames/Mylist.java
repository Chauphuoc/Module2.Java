package ArrayListExampleJames;

import java.util.Arrays;

public class Mylist<E> {
    int size =0;
    static final int Deafault_Capacity = 10;
    Object [] elements =new Object[Deafault_Capacity] ;

    public Mylist() {
        elements = new Object[Deafault_Capacity];
    }
    public void ensureCapal(){
        int newsize = elements.length*2;
        elements= Arrays.copyOf(elements,newsize);
    }

    public void add(Object element){
        if (size>=elements.length){
        ensureCapal();
        }
        elements[size]=element;
        size++;
    }
    public void add(int index, Object element){
        if (index>=0&&index<size){
            size++;
            ensureCapal();
            for (int i = size; i >=index;i--){
                if (i==index){
                    elements[i]=element;
                }
                else {
                    elements[i]=elements[i-1];
                }
            }
        }
        else throw new IndexOutOfBoundsException("index"+index);
    }
    public void remove (int index){
        for (int i = index;i<size;i++){
            elements[i]=elements[i+1];
            size--;
        }
    }
    public int size(){
        return this.size;
    }
    public void clear (){
        size=0;
        for (int i = 0; i< elements.length;i++){
            elements[i]=null;
        }
    }

    public E get(int index){
        if (index<0||index>=size){
            throw new IndexOutOfBoundsException("Index"+index+"Size:"+size);
        }

        return (E) elements[index];
    }

    public int indexOf (Object element){
        for (int i = 0; i <size;i++){
            if(elements[i]==element){
                return i;
            }
        }
        return -1;
    }

    public Mylist<E> clone (){
        Mylist<E> newArray = new Mylist<E>();
        newArray.elements = Arrays.copyOf(this.elements,this.size);
        newArray.size=this.size;
        return newArray;
    }
    public boolean contains (Object a){
        for (int i = 0; i <size;i++){
            if (elements[i].equals(a)){
                return true;
            }
        }
        return false;
    }
    public void printing (){
        String arr = "[";
        for (int i=0;i<size;i++){
            if (i==size-1){
                arr+=elements[i]+"]";
                break;
            }
            arr+= elements[i]+",";
        }
        System.out.println(arr);
    }
}
