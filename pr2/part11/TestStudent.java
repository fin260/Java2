package pr2.part11;

import java.text.DateFormat;
import java.util.Calendar;

public class TestStudent {
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();
        cal.set(2006, Calendar.MARCH, 15, 0, 0, 0);
        Student s = new Student("Иванов Иван Иванович", "УИБО-01-24", cal.getTime());
        System.out.println(s);
        System.out.println("Короткий формат:  " + s.getBirthDateString(DateFormat.SHORT));
        System.out.println("Средний формат:   " + s.getBirthDateString(DateFormat.MEDIUM));
        System.out.println("Длинный формат:   " + s.getBirthDateString(DateFormat.LONG));
        System.out.println("Полный формат:    " + s.getBirthDateString(DateFormat.FULL));
        System.out.println("Свой шаблон:      " + s.getBirthDateString("dd/MM/yyyy, EEEE"));
    }
}
