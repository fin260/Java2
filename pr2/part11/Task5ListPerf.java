package pr2.part11;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class Task5ListPerf {
    static final int N = 50_000;

    static long insertMiddle(List<Integer> list) {
        long t = System.nanoTime();
        for (int i = 0; i < N; i++) list.add(list.size() / 2, i);
        return System.nanoTime() - t;
    }

    static long add(List<Integer> list) {
        long t = System.nanoTime();
        for (int i = 0; i < N; i++) list.add(i);
        return System.nanoTime() - t;
    }

    static long search(List<Integer> list, int[] samples) {
        long t = System.nanoTime();
        int found = 0;
        for (int x : samples) if (list.indexOf(x) >= 0) found++;
        long d = System.nanoTime() - t;
        if (found < 0) System.out.println();
        return d;
    }

    static long removeMiddle(List<Integer> list) {
        long t = System.nanoTime();
        while (list.size() > N / 2) list.remove(list.size() / 2);
        return System.nanoTime() - t;
    }

    public static void main(String[] args) {
        Random rnd = new Random(1);
        int[] samples = new int[200];
        for (int i = 0; i < samples.length; i++) samples[i] = rnd.nextInt(N);

        List<Integer> al = new ArrayList<>();
        List<Integer> ll = new LinkedList<>();

        // прогрев JIT
        for (int k = 0; k < 2; k++) {
            List<Integer> a = new ArrayList<>(), l = new LinkedList<>();
            add(a); add(l); search(a, samples); search(l, samples);
        }

        System.out.printf("N = %d элементов%n", N);
        System.out.printf("%-34s %12s %12s%n", "Операция", "ArrayList,мс", "LinkedList,мс");
        System.out.printf("%-34s %12.2f %12.2f%n", "Добавление в конец", add(al) / 1e6, add(ll) / 1e6);
        System.out.printf("%-34s %12.2f %12.2f%n", "Поиск по образцу (200 индексов)", search(al, samples) / 1e6, search(ll, samples) / 1e6);
        System.out.printf("%-34s %12.2f %12.2f%n", "Удаление из середины (N/2 раз)", removeMiddle(al) / 1e6, removeMiddle(ll) / 1e6);
        al.clear(); ll.clear();
        System.out.printf("%-34s %12.2f %12.2f%n", "Вставка в середину", insertMiddle(al) / 1e6, insertMiddle(ll) / 1e6);
    }
}
