package AdditionalTask5;

import java.util.Objects;

public class Animal implements Comparable<Animal> {
    private final String animalBreed;
    private final String name;
    private int weight;

    public Animal(String animalBreed, String name, int weight) {
        if (animalBreed == null || name == null || weight <= 0)
            throw new IllegalArgumentException();
        this.animalBreed = animalBreed;
        this.name = name;
        this.weight = weight;
    }

    public String getAnimalBreed() {
        return animalBreed;
    }

    public String getName() {
        return name;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return Objects.equals(animalBreed, animal.animalBreed) && Objects.equals(name, animal.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(animalBreed, name);
    }

    @Override
    public String toString() {
        return "Animal{" +
                "animalBreed='" + animalBreed + '\'' +
                ", name='" + name + '\'' +
                ", weight=" + weight +
                '}';
    }

    @Override
    public int compareTo(Animal o) {
        return this.weight - o.weight;
    }
}
