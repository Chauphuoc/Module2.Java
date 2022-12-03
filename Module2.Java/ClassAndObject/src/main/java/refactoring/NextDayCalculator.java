package refactoring;

import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class NextDayCalculator {
    public String nextdaycalculator (Calendar x, int y){
        x.add(Calendar.DATE,y);
        return String.format("Date: %s; Month: %s; Year: %s",x.get(Calendar.DATE),x.get(Calendar.MONTH),x.get(Calendar.YEAR));
    }

    public static void main(String[] args) {
//        NextDayCalculator exam1 = new NextDayCalculator();
//        System.out.println(exam1.nextdaycalculator(7,3,1996));
//        long t1 = System.currentTimeMillis();
//        for (int i = 0 ; i<1000;i++){
//            System.out.println("Test");
//        }
//        long t2 = System.currentTimeMillis();
//        System.out.println(String.format("mls: %s",t2-t1));
//        System.out.println(String.format("s: %s",(t2-t1)/1000));
//        System.out.println("3000 nam:"+ TimeUnit.DAYS.toHours(3000)+"d");
        Date checkDay = new Date();
        checkDay.setDate(1);
        checkDay.setMonth(1);
        checkDay.setYear(2018);
        System.out.println(checkDay.getDate());
    }
}
