package lesson6;

import java.util.Scanner;

public class Dz {
    public static void main(String[] args) {
        String[][] tours = {{"Греция", "30000", "7", "дней", "5", "звезд", "всё включено"},
                            {"Греция", "60000", "14", "дней", "5", "звезд", "всё включено"},
                            {"Сочи", "20000", "7", "дней", "3", "звезды", "всё включено"},
                            {"Сочи", "15000", "7", "дней", "3", "звезды", "Пансионат"},
                            {"Сочи", "40000", "14", "дней", "3", "звезды", "всё включено"},
                            {"Сочи", "30000", "14", "дней", "3", "звезды", "Пансионат"},
                            {"Франция", "50000", "14", "дней", "4", "звезды", "всё включено"},
                            {"Франция", "20000", "5", "дней", "4", "звезды", "Пансионат"}};

        System.out.println("В какую страну хотите поехать?");
        Scanner sc = new Scanner(System.in);
        String inputCountry = sc.nextLine();
        Methods.printTourByCountry(inputCountry, tours);

        System.out.println("На сколько дней планируете взять тур?");
        //Scanner sc = new Scanner(System.in);
        String inputDays = sc.nextLine();
        Methods.printTourByDays(inputDays, tours);

        System.out.println("Выберите: всё включено или Пансионат ?");
        String inputOption = sc.nextLine();
        Methods.printTourByOption(inputOption, tours);

        System.out.println("Сколько Вы готовы потратить на Тур? ");
        String inputPriceFrom = sc.nextLine();
        Methods.printTourByPrice(inputPriceFrom, tours);

        Methods.sumTours(tours);

    }
}
