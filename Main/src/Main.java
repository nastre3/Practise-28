import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        char[] charArray = new char[5];
        System.out.println(charArray.length);

        charArray[0]= 'r';
        charArray[1]= 'a';
        charArray[2]= 'w';
        charArray[3]= 'c';
        charArray[4]= 'h';

        Arrays.sort(charArray);// сортировка
        Arrays.fill(charArray, 'f'); // заполнение массива статическими элементами
        System.out.println(charArray);


    }
}
