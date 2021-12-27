import java.util.*;

public class Main {
    public static void main(String[] args) {
        char[] charArray = new char[5];
        System.out.println(charArray.length);

        charArray[0]= 'r';
        charArray[1]= 'a';
        charArray[2]= 'w';
        charArray[3]= 'c';
        charArray[4]= 'h';

        Arrays.sort(charArray);// сортировка
        Arrays.fill(charArray, 'f'); // заполнение массива статическими элементами
        System.out.println(charArray);

        Collection col = new List() { // вставьте нужный код
            // другие переопределенные методы скрыты для краткости
            @Override
            public Object set(int index, Object element) {
                return null;
            }
            @Override
            public int indexOf(Object o) {
                return 0;
            }
        }
    }

    private static void collectionWork(Queue col) { // вставьте нужный код
        Object polledObject = col.poll();
    }

    private static void collectionWork(Collection collection) {
        Map col = (Map) collection; // вставьте нужный код
        col.put("Element 1", new Object());
    }
}
