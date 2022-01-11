package Сar;

import java.util.*;

public class Main {
    public static final String TOYOTA = "Toyota";
    public static final String BMW = "BMW";
    public static final String KIA = "KIA";

    public static void main(String[] args) {
        Car car1 = new Car(TOYOTA, "Camri", false);
        Car car2 = new Car(KIA, "Rio", false);
        Car car3 = new Car(BMW, "X5", true);
        Car car4 = new Car(TOYOTA, "Camri", false);
        Car car5 = new Car(KIA, "Rio", false);
        Car car6 = new Car(BMW, "X5", true);

        List<Car> carList = new ArrayList<>();
        carList.add(car1);
        carList.add(car2);
        carList.add(car3);
        carList.add(car4);
        carList.add(car5);
        carList.add(car6);

        Set<Car> carSet = new HashSet<>(carList); // позволяет избежать дублей после добавления equals, hashcode методов
        for (Car car : carSet) {
            System.out.println(car);
        }

        Set<Double> set = new TreeSet<>();

        set.add(21.5);
        set.add(14.2);
        set.add(8d); // 1
        set.add(8.0);

        System.out.println(set);
    }
}
