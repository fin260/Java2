package pr2.part11;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Task4DateCalendar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Год: ");
        int year = sc.nextInt();
        System.out.print("Месяц (1-12): ");
        int month = sc.nextInt();
        System.out.print("Число: ");
        int day = sc.nextInt();
        System.out.print("Часы: ");
        int hour = sc.nextInt();
        System.out.print("Минуты: ");
        int minute = sc.nextInt();

        Calendar cal = Calendar.getInstance();
        cal.clear();
        cal.set(year, month - 1, day, hour, minute);
        Date date = cal.getTime();

        SimpleDateFormat fmt = new SimpleDateFormat("dd.MM.yyyy HH:mm");
        System.out.println("Calendar: " + fmt.format(cal.getTime()));
        System.out.println("Date:     " + fmt.format(date));
        System.out.println("Date.toString(): " + date);
        System.out.println("Миллисекунд с 01.01.1970: " + date.getTime());
        System.out.println("День недели (Calendar): " + cal.get(Calendar.DAY_OF_WEEK));
    }
}
