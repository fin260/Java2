package pr2.part11;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Task1Developer {
    public static void main(String[] args) {
        SimpleDateFormat fmt = new SimpleDateFormat("dd.MM.yyyy HH:mm:ss");
        // Дата и время получения задания задаются фиксированно
        Date received = new Date(1778400000000L);
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
