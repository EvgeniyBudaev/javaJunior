package lesson6;

import java.util.Scanner;

//Турагентство
public class Main3 {
    public static void main(String[] args) {
        String[][] tours = {{"Греция", "15000", "7 дней", "5", "всё включено"},
                {"Франция", "30000", "6 дней", "5", "всё включено"},
                {"Италия", "5000", "14 дней", "3", "Пансионат"},
                {"Италия", "10000", "5 дней", "4", "всё включено"},
                {"Германия", "50000", "14 дней", "3", "Пансионат"}};

        System.out.println("В какую страну хотите поехать?");
        Scanner sc = new Scanner(System.in);
        String inputCountry = sc.nextLine();
        SearchTour.printTourByCountry(inputCountry, tours);

        System.out.println("Сколько звезд?");
        String inputZvezd = sc.nextLine();
        SearchTour.printTourByZvezd( inputZvezd, tours);
//Работа с числами
        System.out.println("введите цену от тура: ");
        String inputPrice = sc.nextLine();
        SearchTour.printToursByPriceFrom(inputPrice, tours);






    }
}
