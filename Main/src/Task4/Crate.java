package Task4;

public class Crate<T> { // Клетка
    private T contents;
    public Crate(T contents) {
        this.contents = contents;
    }

    public Crate() {

    }

    public T getContents() {
        return contents;
    }

    public void setContents(T contents) {
        this.contents = contents;
    }

    public static void main(String[] args) {
        Crate<Elephant> crateForElephant = new Crate<>(); // создали клетку для слона
        Crate<Monkey> crateForMonkey = new Crate<>(); // и клетку для обезьяны
        Crate<Wolf> crateForWolf = new Crate<>(); // и клетку для волка
// как видите, нам не потребовалось определять каждый раз новый класс для клеток
        Elephant elephant = crateForElephant.getContents();
        Monkey monkey = crateForMonkey.getContents();
        Wolf wolf = crateForWolf.getContents();

        // crateForElephant.setContents(new Wolf()); // compile error
    }
}