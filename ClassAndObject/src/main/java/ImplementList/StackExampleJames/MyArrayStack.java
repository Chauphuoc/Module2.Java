package ImplementList.StackExampleJames;

public class MyArrayStack implements MyStackandQueue{
    private int size;
    private int[] array;
    private int topIndex;

    public MyArrayStack(int size) {
        this.size = size;
        array=new int[size];
        topIndex=-1;
    }

    @Override
    public boolean push(int value) {
        if (!isFull()){
            topIndex++;
            array[topIndex]=value;
            return true;
        }
        return false;
    }

    @Override
    public int pop() {
        int value =-1;
        if (!isEmpty()){
            value= array[topIndex];
            topIndex--;
        }
        return value;
    }

    @Override
    public boolean isFull() {
        return topIndex==size-1;
    }

    @Override
    public boolean isEmpty() {
        return topIndex==-1;
    }

    @Override
    public void priting() {
        if (isEmpty()){
            System.out.println("List is Empty");
        }
        else {
            for (int i = 0 ; i <= topIndex;i++){
                System.out.print(array[i]+" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        MyArrayStack newArr = new MyArrayStack(4);
        newArr.push(4);
        newArr.push(18);
        newArr.push(9);
        newArr.push(7);
        System.out.println(newArr.pop());;
        newArr.priting();
        System.out.println(newArr.isFull());
    }
}
