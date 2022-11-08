package comparable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CalenderDateClient {
    public static void main(String[] args) {
        //Declare and define list of CalenderDate
        List<CalendarDate> dateList = new ArrayList<>();
        dateList.add(new CalendarDate(1995, 1, 21));
        dateList.add(new CalendarDate(1993, 3, 10));
        dateList.add(new CalendarDate(1998, 3, 23));

        //Collections.sort(list);
        System.out.println("Sorting " + dateList);
        Collections.sort(dateList);
        System.out.println("   result " + dateList);
    }
}