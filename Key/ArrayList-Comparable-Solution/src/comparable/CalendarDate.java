package comparable;

//Make this code implement Comparable interface
public class CalendarDate implements Comparable<CalendarDate> {
    private int year;
    private int month;
    private int day;
    
    public CalendarDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }
    
    public int getYear() {
        return year;
    }
    
    public int getMonth() {
        return month;
    }
    
    public int getDay() {
        return day;
    }
    
    public String toString() {
        return year + "/" + String.format("%02d", month) + "/" + String.format("%02d", day);
    }

    // YOUR CODE GOES HERE

    @Override
    public int compareTo(CalendarDate o) {
        if (o.year == this.year) {
            // dates are in the same year
            if (o.month == this.month) {
                // dates are in the same year AND month
                return this.day - o.day;
            }
            return this.month - o.month;
        }
        // dates are NOT in the same year
        return this.year - o.year;
    }
}