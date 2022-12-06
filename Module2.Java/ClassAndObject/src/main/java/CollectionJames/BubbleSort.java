package CollectionJames;

public class BubbleSort {
    static int[] list = {2, 3, 2, 5, 6, 1, -2, 3, 14, 12};
    public void bubbleSort(int[] list){
        for (int i = 0; i< list.length-1;i++){
            for (int j = i; j <list.length;j++){
                if (list[i]>list[j]){
                    int temp = list[i];
                    list[i]=list[j];
                    list[j]=temp;
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
