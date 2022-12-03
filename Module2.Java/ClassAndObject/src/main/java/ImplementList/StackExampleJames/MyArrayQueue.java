package ImplementList.StackExampleJames;

public class MyArrayQueue implements MyStackandQueue {
    private int[] array;
    private int size;
    private int headIndex;
    private int tailIndex;
    private int capacity;
    public MyArrayQueue (int size){
        this.size = size;
        array = new int[size];
        headIndex=tailIndex=-1;
    }

    public int getSize(){
        return this.size;
    }

    public boolean isEmpty (){
        if (headIndex==-1&tailIndex==-1){
            return true;
        }
        return false;
    }

    @Override
    public void priting() {
        if (isEmpty()){
            System.out.println("List is Empty");
        }
        else {
            for (int i=headIndex; i <= tailIndex; i++){
                System.out.print(array[i]);
            }
            System.out.println();
        }
    }

    @Override
    public boolean push(int value) {
        if (!isFull()){
            if (isEmpty()){
                headIndex++;
            }
            tailIndex++;
            array[tailIndex]=value;
            return true;
        }
        return false;
    }

    @Override
    public int pop() {
        int value=-1;
        if (!isEmpty()){
            value = array[headIndex];
            headIndex++;
            if (headIndex>tailIndex){
                headIndex=tailIndex=-1;
            }
        }
        return value;
    }

    public boolean isFull (){
        if (tailIndex==size-1){
            return true;
        }
        return false;
    }


    public static void main(String[] args) {
        MyArrayQueue queue = new MyArrayQueue(3);
        System.out.println(queue.push(1));
        System.out.println(queue.push(2));
        System.out.println(queue.push(3));
        System.out.println(queue.push(4));
        queue.priting();
        System.out.println(queue.pop());
        System.out.println("size is:" +queue.getSize());
//        queue.priting();
//        System.out.println(queue.pop());
//        queue.priting();
//        System.out.println(queue.pop());
//        queue.priting();
//        System.out.println(queue.pop());
//        queue.priting();
    }
}
