package lesson2;

public class Domashka3 { // Выводим на консоль сумму чисел в диапозоне от 50 до 1000, которые делятся без остатка на 7 и на 19
    public static void main(String[] args) {
         int summa = 0;
        for (int i = 500 ; i < 1001; i++) {
            if (i % 7 == 0 && i % 19 == 0) {
                summa = summa + i;
            }
            }
                System.out.println(summa);
        }

    }

