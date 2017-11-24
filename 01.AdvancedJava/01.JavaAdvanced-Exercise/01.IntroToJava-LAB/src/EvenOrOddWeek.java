import java.util.Calendar;
import java.util.Date;


public class EvenOrOddWeek {
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();
        Date calen = new Date();
        cal.setTime(calen);
        int week = cal.get(Calendar.WEEK_OF_YEAR);

        System.out.println(week % 2 == 0 ? "Even" : "Odd");
    }
}
