package lesson3;

public class Domashka1 { // Массив длинной из 10 символов. Выводим на консоль по одному символу из массива, начиная с конца в начало.
    public static void main(String[] args) {
        int[] number = {2, 4, 8, 7, 5, 6, 9, 10, 23, 50};

        for (int i = number.length-1; i >=0; i--) {
            System.out.println(number[i]);

        }
    }
}
