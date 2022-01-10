package Сar;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

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
    }
}
