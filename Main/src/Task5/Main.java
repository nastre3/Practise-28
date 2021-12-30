package Task5;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Box<Integer> integerBox = new Box<>(15);
        Number number = integerBox.getContents(); // строка 4
        System.out.println(number.getClass().getSimpleName());

        List<Integer> list = new ArrayList<>(15);
        System.out.println(list.size());

        LinkedList<Integer> list2 = new LinkedList<>();
        list2.add(15);
        list2.addLast(28);
        list2.remove(0);
        list2.set(0, 33);
        list2.addFirst(null);
        List<Integer> anotherList = list2; // 1
        System.out.println(anotherList);
    }
}