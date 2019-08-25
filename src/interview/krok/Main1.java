package interview.krok;

import java.util.Scanner;

/*Задача №1:
        В первой строке ввести n - количество целых чисел. Во второй строке ввести числа через пробел, чисел может быть
        введено >n. Вывести сумму n первых введенных чисел.*/
public class Main1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
            int amountOfNum = scanner.nextInt();

            int sum = 0;
            for (int i = 0; i < amountOfNum; i++) {
                sum += scanner.nextInt();
            }

            System.out.println(sum);
        }
    }


