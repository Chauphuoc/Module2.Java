package CollectionJames;

public class BubbleSort {
    static int[] list = {2, 3, 2, 5, 6, 1, -2, 3, 14, 12};
    public void bubbleSort(int[] list){
        boolean swapSomething = true;
        while (swapSomething){
            swapSomething = false;
            for (int i = 0; i< list.length-1; i++){
                if (list[i]>list[i+1]){
                    int temp = list[i];
                    list[i]=list[i+1];
                    list[i+1]=temp;
                    swapSomething = true;
                }
            }
        }

    }

    public static void main(String[] args) {
        BubbleSort check = new BubbleSort();
        check.bubbleSort(list);
        for (int i = 0; i < list.length; i++){
            System.out.print(list[i]+" ");
        }
    }
}
