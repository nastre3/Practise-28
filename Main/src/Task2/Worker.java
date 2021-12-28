package Task2;

import java.util.Deque; // импортируем Deque, так как у Queue нет методов для работы с концом коллекции

public class Worker {
    private Deque toDoDeque;
    public Worker(Deque toDoDeque) {
        this.toDoDeque = toDoDeque;
    }
    public void takeTask() {
        Object task = toDoDeque.pollLast(); // вынимаем задание из конца Deque
        if (task != null) {
            System.out.println("Выполняю задачу: " + task);
        } else {
            System.out.println("Нет работы! Можно идти домой");
        }
    }
}
