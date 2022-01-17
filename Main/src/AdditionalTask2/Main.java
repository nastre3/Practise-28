package AdditionalTask2;

import java.util.ArrayDeque;
import java.util.Deque;

public class Main {
    public static void main(String[] args) {
        Deque deque = new ArrayDeque();
        deque.offer(12);
        deque.add(6);
        deque.add(4); // Заполнили очередь элементами, начало - 12 6 4 - хвост

        deque.poll(); // Вынули элемент из начала (как в стеке, последний
        // добавленный)
        deque.peek(); // Ничего не вынули, просто взяли ссылку на 6, которую не
        // присвоили к переменной
        System.out.println(deque.element()); // взяли ссылку на элемент 6 и
        // распечатали его
    }
}