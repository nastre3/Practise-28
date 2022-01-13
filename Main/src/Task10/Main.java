package Task10;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Set<Car> cars = new TreeSet<>(Comparator.reverseOrder()); // строка 1
        cars.add(new Car("Toyota", 243423424L)); // строка 2
        cars.add(new Car("Subaru", 112313213L));
        System.out.println(cars);

        ArrayDeque<String> greetings = new ArrayDeque<>();
        greetings.push("hello");
        greetings.push("hi");
        greetings.push("ola");
        greetings.pop();
        greetings.peek();
        while (greetings.peek() != null) {
            System.out.print(greetings.pop());
        }

        Map<Integer, Integer> map = new HashMap<>(); // строка 1
        for (int i = 1; i <= 10; i++) {
            map.put(i, i * i); // строка 2
        }
        System.out.println(map.get(4)); // строка 3
    }
}