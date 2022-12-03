package Animals;
import java.time.LocalTime;

public class stopWatch {
    private long starTime;
    private long stopTime =1000;
    public long getStarTime(){
        return starTime;
    }
    public long getStopTime (){
        return stopTime;
    }
    public void setStarTime (){
        this.starTime = System.currentTimeMillis();
    }
    public void setStopTime (){
        this.stopTime = System.currentTimeMillis();
    }
    public stopWatch (){
       this.starTime =  System.currentTimeMillis();
    }
    public long getElapsedTime(){
        return stopTime - starTime;
    }
    public static void main(String[] args) {
        stopWatch stopwatch = new stopWatch();

        stopwatch.setStopTime();
        System.out.println(stopwatch.getStopTime());
        System.out.println(stopwatch.getStopTime()-stopwatch.getStarTime());

    }
//    private long endTime;
//    public stopWatch (){
//        starTime = LocalTime.now();
//    }
//    public stopWatch (LocalTime starTime, LocalTime endTime){
//        this.starTime = starTime;
//        this.endTime = endTime;
//    }
//    public void start(){
//        starTime = LocalTime.now();
//    }
//    public void stop(){
//        endTime = LocalTime.now();
//    }
//    public LocalTime getStarTime (){
//        return starTime;
//    }
//    public LocalTime getEndTime (){
//        return endTime;
//    }
//    public int getElapsedTime(){
//        int miliSecond = ((endTime.getHour()-starTime.getHour())*3600 + (endTime.getMinute()-starTime.getMinute())*60 + (endTime.getSecond()-starTime.getSecond())*1000);
//        return miliSecond;
//    }
//    public static void main(String[] args){
//        public static int[] selectionSort (int size){
//            int [] array = new int[size];
//            for(int i=0;i<array.length-1;i++){
//                for(int j=i+1;j<array.length;j++){
//                    if(array[j]<array[i]){
//                        int tempt = array[i];
//                        array[i]=array[j];
//                        array[j]=tempt;
//                    }
//                }
//            }
//            return array;
//        }
//
//        public static void main(String[] args) {
//            int []a= new int [100000];
//            for (int i = 0; i < 100000; i++) {
//                a[i]=(int)(Math.random()*1000);
//            }
//            LocalTime start = LocalTime.now();
//            array=selectionSort(array);
//            LocalTime end = LocalTime.now();
//            stopWatch sw = new stopWatch(start, end);
//            System.out.println("Time: "+sw.getElapsedTime());
//            for(int x : a){
//                System.out.println(x);
//            }
//        }
    }

