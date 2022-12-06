package CollectionJames;

public class InsertionSort {
    static int[] list = {2, 3, 2, 5, 6, 1, -2, 3, 14, 12};
    public static void insertionSort (int[] list){
        for (int i = 1; i< list.length;i++){
            int temp = list[i];
            int j = i-1;
            while (j>=0&&list[j]>temp){
                list[j+1]=list[j];
                j--;
            }
            list[j+1]=temp;
        }
    }

    public static void main(String[] args) {
        insertionSort(list);
        for (int i : list){
            System.out.print(i+ " ");
        }
    }
}
