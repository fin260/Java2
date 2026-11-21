package pr2.extra;

import java.util.GregorianCalendar;

public class Task5Gregorian {
    static void show(String title, GregorianCalendar c) {
        System.out.println(title + ": год = " + c.get(GregorianCalendar.YEAR)
                + ", месяц = " + c.get(GregorianCalendar.MONTH)
                + " (" + (c.get(GregorianCalendar.MONTH) + 1) + "-й по счёту)"
                + ", день = " + c.get(GregorianCalendar.DAY_OF_MONTH));
    }

    public static void main(String[] args) {
        GregorianCalendar now = new GregorianCalendar();
        show("Текущая дата", now);
        GregorianCalendar c = new GregorianCalendar();
        c.setTimeInMillis(1234567898765L);
        show("Для 1234567898765L", c);
    }
}
