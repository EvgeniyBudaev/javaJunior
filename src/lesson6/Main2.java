package lesson6;

import java.util.Scanner;

// КОНСОЛЬ
public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Добрый день, как Вас зовут?");
        String inputName = sc.nextLine();
        System.out.println("Привет, " + inputName);
        System.out.println("Как дела?");
        String inputKakDela = sc.nextLine();
        if (inputKakDela.equalsIgnoreCase("Хорошо") || inputKakDela.equalsIgnoreCase("Отлично")) {
            System.out.println("Отлично! Так держать!");
        } else {
            System.out.println("Не переживай, все наладится!");
        }
    }
}
