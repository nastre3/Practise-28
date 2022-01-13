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
        /*
        for (Car car : carSet) {
            System.out.println(car);
        } */

        // Пример HashMap
        Map<Car, Integer> carMap = new HashMap<>();
        for (Car car: carList) { // пробежали циклом по всему списку и положили в HashMap
            if(carMap.containsKey(car)) { // если эл-т есть
                int value = carMap.get(car); // достали значение по ключу
                carMap.put(car, ++value); // переложили значение по ключу, повысив value
            } else {
                carMap.put(car, 1); // есть минимум одна такая уникальная машина
            }
        }

        // Итерация по HashMap (кол-во одинаковых машин по совпадению 3 пар-ов)
        for(Map.Entry<Car, Integer> carEntry:carMap.entrySet()) { // Car - ключ(key), Integer - значение(value)
            // у carMap достали entrySet
            System.out.println(carEntry.getKey() + "=" + carEntry.getValue());
        }

        Set<Car> carSet2 = new TreeSet<>(new CarComparator().reversed()); // reversed - сортировка в обратном порядке
        carSet.addAll(carList);
        System.out.println();

        for (Car car:carSet2) {
            System.out.println(car.getName());
        }
    }
}
