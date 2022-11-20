package refactoring;

import org.junit.jupiter.api.Test;

import java.util.Calendar;
import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

class NextDayCalculatorTest {
@Test
    void TestNextDay (){
    Calendar checkDay = Calendar.getInstance();
    checkDay.set(Calendar.DATE,35);
    checkDay.set(Calendar.MONTH,10);
    checkDay.set(Calendar.YEAR,2022);
    System.out.println(checkDay.get(Calendar.DATE)+"-"+(checkDay.get(Calendar.MONTH)+1)+"-"+(checkDay.get(Calendar.YEAR)));
    NextDayCalculator exam1 = new NextDayCalculator();
    assertEquals("Date: 21; Month: 10; Year: 2022",
            exam1.nextdaycalculator(checkDay.get(Calendar.DATE),checkDay.get(Calendar.MONTH),checkDay.get(Calendar.YEAR)));
}

}