package pr2.extra;

import java.util.Date;

public class Task3DateElapsed {
    public static void main(String[] args) {
        long[] times = {10000L, 100000L, 1000000L, 10000000L, 100000000L,
                1000000000L, 10000000000L, 100000000000L};
        Date date = new Date();
        for (long t : times) {
            date.setTime(t);
            System.out.println(t + " мс -> " + date.toString());
        }
    }
}
