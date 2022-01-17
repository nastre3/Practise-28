package AdditionalTask5;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Animal> AnimalList = new ArrayList<>();
        AnimalList.add(new Animal("Cat", "Barsik", 2));
        AnimalList.add(new Animal("Dog", "Bobik",  5));
        AnimalList.add(new Animal("Parrot", "Kesha",  5));
        AnimalList.add(new Animal("Dog", "Bob",  2));
        AnimalList.add(new Animal("Pig", "Hrew",  9));
        AnimalList.add(new Animal("Spider", "William",  6));
        AnimalList.add(new Animal("Mouse", "Lu",  1));

        System.out.println(AnimalList);

        System.out.println("\nСортировка по длине клички:");
        Collections.sort(AnimalList, new ComparatorNameLength());
        System.out.println(AnimalList);

        Set<Animal> petSet = new TreeSet<>(AnimalList);
        System.out.println("\nСортировка по весу:");
        System.out.println(petSet);
    }
}
