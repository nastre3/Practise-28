package AdditionalTask5;

import java.util.Comparator;

public class ComparatorNameLength implements Comparator<Animal> {

    @Override
    public int compare(Animal o1, Animal o2) {
        return o2.getName().length() - o1.getName().length();
    }
}