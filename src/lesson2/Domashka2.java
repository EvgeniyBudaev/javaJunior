package lesson2;

public class Domashka2 { // Выводим числа в диапозоне от 500 до 1000, которые делятся без остатка на 7  и на 19
    public static void main(String[] args) {

        for (double i = 500 ; i < 1001; i++) {
            if (i % 7 == 0 && i % 19 == 0) {
                System.out.println(i);

            }
        }
    }
}
