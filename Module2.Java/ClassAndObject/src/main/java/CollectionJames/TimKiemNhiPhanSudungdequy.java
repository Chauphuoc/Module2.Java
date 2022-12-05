package CollectionJames;

import java.util.ArrayList;
import java.util.Arrays;

public class TimKiemNhiPhanSudungdequy {
    public static int [] list =  {62, 74, 17, 10, 11, 45, 50, 9, 6, 66, 69, 70, 79};

    public int[] arrange(){
        int temp = list[0];
       for (int i = 0; i < list.length-1;i++){
           for (int j = i; j < list.length;j++){
               if (list[i]>list[j]){
                   temp =list[i];
                    list[i]=list[j];
                    list[j] = temp;
               }
           }
       }
        return list ;
    }

    public int binarySearch(int[] list,int key){
        int left = 0;
        int right = list.length -1;
        while (left<right){
            int mid = (left + right)/2;
            if (key<list[mid]){
                right = mid -1;
            }
            else if (key>list[mid]){
                left = mid +1;
            }
            else return mid;
        }
        return -1;
    }

    public static void main(String[] args) {
        TimKiemNhiPhanSudungdequy check = new TimKiemNhiPhanSudungdequy();
        int [] list = check.arrange();

        System.out.println(Arrays.toString(list));
        System.out.println(check.binarySearch(list,10));
    }
}
