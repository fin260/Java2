package pr2.part11;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Task2Compare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat fmt = new SimpleDateFormat("dd.MM.yyyy HH:mm");
        fmt.setLenient(false);
        System.out.print("Введите дату и время (дд.мм.гггг чч:мм): ");
        String line = sc.nextLine();
        try {
            Date entered = fmt.parse(line);
            Date now = new Date();
            System.out.println("Введённая дата: " + fmt.format(entered));
            System.out.println("Текущая дата:   " + fmt.format(now));
            if (entered.before(now)) {
                System.out.println("Введённая дата раньше текущей");
            } else if (entered.after(now)) {
                System.out.println("Введённая дата позже текущей");
            } else {
                System.out.println("Даты совпадают");
            }
            System.out.println("compareTo = " + entered.compareTo(now));
            long diff = Math.abs(now.getTime() - entered.getTime());
            System.out.println("Разница: " + diff / (1000L * 60 * 60 * 24) + " дн.");
        } catch (ParseException e) {
            System.out.println("Неверный формат даты: " + line);
        }
    }
}
