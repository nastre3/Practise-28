package Task5;

public class Main {
    public static void main(String[] args) {
        Box<Integer> integerBox = new Box<>(15);
        Number number = integerBox.getContents(); // строка 4
        System.out.println(number.getClass().getSimpleName());
    }
}