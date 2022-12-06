package CollectionJames;

public class InsertionSort {
    static int[] list = {2, 3, 2, 5, 6, 1, -2, 3, 14, 12};
    public static void insertionSort (int[] list){
        for (int i = 1; i< list.length;i++){
            int j = i-1;
            int temp = list[i];
            while (j>=0&&list[j]>temp){
                list[j+1] = list[j];
                j--;
            }
            list[j+1]=temp;
        }
    }

    public static void selectionSort (int [] list){
        for (int i = 0; i < list.length-1;i++){
            int minIndex = i;
            for (int j = i+1;j< list.length;j++){
                if (list[minIndex]>list[j]){
                    minIndex = j;
                }
            }
            int temp = list[i];
            list[i] = list[minIndex];
            list[minIndex] = temp;
        }
    }

    public static void main(String[] args) {
//        insertionSort(list);
        selectionSort(list);
        for (int i : list){
            System.out.print(i+ " ");
        }
    }
}
