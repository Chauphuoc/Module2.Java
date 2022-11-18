package AbstractAndInterface;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {

        Geomatric[] geomatrics = new Geomatric[4];
        geomatrics[0] = new Rectangle(4,8);
        geomatrics[1] = new Rectangle(7,9);
        geomatrics[2] = new Rectangle(2,7);
        geomatrics[3] = new Rectangle(6,7);
//        Comparator myComparator = new ComparatorByArea();
        for (int i = 0; i<geomatrics.length-1;i++){
            for (int j = i+1; j<geomatrics.length;j++){
                Rectangle r1 = (Rectangle) geomatrics[i];
                Rectangle r2 = (Rectangle) geomatrics[j];
                    if (r1.compareArea(r2)==1){
                        Geomatric temp = geomatrics[i];
                        geomatrics[i] = geomatrics[j];
                        geomatrics[j] = temp;
                    }
                }
            }
        System.out.println(Arrays.toString(geomatrics));
        for (int i = 0; i<geomatrics.length -1;i++){
            for (int j = i+1;j<geomatrics.length;j++){
                Rectangle r1 = (Rectangle) geomatrics[i];
                Rectangle r2 = (Rectangle) geomatrics[j];
                if (r1.comparePerimeter(r2)==1){
                    Geomatric temp = geomatrics[i];
                    geomatrics[i] = geomatrics[j];
                    geomatrics[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(geomatrics));
        Geomatric[] circles = new Geomatric[3];
        circles[0]=new Circle(4);
        circles[1]=new Circle(7);
        circles[2]=new Circle(3);
        for (int i = 0;i< circles.length-1;i++){
            for (int j = i+1 ; j <circles.length;j++) {
                Circle r1 = (Circle) circles[i];
                Circle r2 = (Circle) circles[j];
                if (r1.compareArea(r2)==1) {
                    Geomatric temp = circles[i];
                    circles[i] = circles[j];
                    circles[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(circles));
    }
//
//
//            }
//        }
//        System.out.println(Arrays.toString(circles));
//    }
//    public static int[] arrangeMethod (){
//        int [] arr = new int[] {4,6,8,7,9};
//        for (int i = 0 ; i < arr.length-1; i++){
//            for (int j = i+1;j<arr.length;j++){
//                if (arr[i]>arr[j]){
//                    int temp = arr[i];
//                    arr[i]= arr[j];
//                    arr[j]=temp;
//                }
//            }
//        }
//        return arr;
//    }

}
