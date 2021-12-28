package Task2;

import java.util.ArrayDeque;
import java.util.Deque;// импортируем Deque, так как у Queue нет методов для работы с концом коллекции

public class Task2 {
    public static void main(String[] args) {
        // с использованием стека вместо очереди
        int numberOfTasks = 5;
        Deque toDoDeque = new ArrayDeque(numberOfTasks); // имплементация
        // остается прежней, ArrayDeque работает и как очередь, и как стек
        Boss boss = new Boss(toDoDeque);
        Worker worker = new Worker(toDoDeque);

        for (int i = 1; i <= numberOfTasks; i++) {
            boss.giveTask("Задание " + i);
        }

        System.out.println("Начальник закончил давать задания");

        for (int i = 1; i <= numberOfTasks + 1; i++) {
            worker.takeTask();
        }
    }
}
