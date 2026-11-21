package pr2.part11;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Task1Developer {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat fmt = new SimpleDateFormat("dd.MM.yyyy HH:mm:ss");
        // Дата и время получения задания
        Date received = fmt.parse("15.10.2026 12:30:00");
        // Дата и время сдачи - текущие
        Date submitted = new Date();
        System.out.println("Разработчик: Пожаров");
        System.out.println("Получение задания: " + fmt.format(received));
        System.out.println("Сдача задания:     " + fmt.format(submitted));
        long ms = submitted.getTime() - System.currentTimeMillis();
        System.out.println("Сдача зафиксирована через System.currentTimeMillis(): "
                + (Math.abs(ms) < 1000 ? "совпадает" : "не совпадает"));
    }
}
