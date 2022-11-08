package comparable;

import java.util.*;

public class CalenderDateClient {
    public static void main(String[] args) {
        //Declare and define list of CalenderDate
        List<CalendarDate> dateList = new ArrayList<>();
        dateList.add(new CalendarDate(1995, 1, 21));
        dateList.add(new CalendarDate(1998, 3, 23));
        dateList.add(new CalendarDate(1998, 8, 27));
        dateList.add(new CalendarDate(1998, 8, 1));
        dateList.add(new CalendarDate(1993, 3, 10));

        System.out.println("Sorting " + dateList);
//        Collections.sort(dateList);
        System.out.println("   result " + dateList);
    }
}
