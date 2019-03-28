package lesson4;

public class Domashka3 { // Входящие параметры - массив чисел. Метод должен печатать на консоль только четные числа из этого массива.
    public static void main(String[] args) {
        int[] masiv = {2, 1, 3, 4, 7};
        for (int i = 0; i < masiv.length; i++) {
            if (masiv[i] % 2 == 0) {
                int a = masiv[i];
                System.out.println(a);
            }
        }
    }
}
