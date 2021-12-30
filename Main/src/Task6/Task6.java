package Task6;

import java.util.ArrayList;

public class Task6 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(100);
        for (int i = 0; i < 100; i++) {
            list.add(i);
        }

        System.out.println(list);
        System.out.println("---------------");
        for (int i = 0, j = 99; i < 50 && j >= 50; i++, j--) {
            int start = list.get(i);
            int end = list.get(j);
            list.set(j, start);
            list.set(i, end);
        }

        System.out.println(list);
    }
}
