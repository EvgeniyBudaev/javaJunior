package lesson13.praktika;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите название страны");
        Scanner scanner = new Scanner(System.in);
        String inputCountry = scanner.next();

        AbstractCountry country = null;

        if(inputCountry.equalsIgnoreCase("Германия")){
           // AbstractCountry germany = new Germany();
            country = new Germany();
            country.setNaselenie(1500000);
            country.getKolichestvoKurortov(10);
            country.setPloshad(454545);
            country.setStolica("Berlin");
            country.setVisa(true);
        }

        if(inputCountry.equalsIgnoreCase("Италия")){
            //AbstractCountry italia = new Italia();
            country = new Italia();
            country.setNaselenie(900000);
            country.getKolichestvoKurortov(20);
            country.setPloshad(121212);
            country.setStolica("Rim");
            country.setVisa(true);
        }
        System.out.println("Что Вы хотите узнать о стране?");
        System.out.println("1 - население");
        System.out.println("2 - количество курортов");
        System.out.println("3 - площадь");
        System.out.println("4 - столица");
        System.out.println("5 - наличие визы");

        int inputAction = scanner.nextInt();

        switch (inputAction){
            case 1: country.printNaselenie();
                break;
            case 2: country.printKolichestvoKurortov();
                break;
            case 3: country.printPloshad();
                break;
            case 4: country.printCountryName();
                break;
            case 5: country.needVisa();
                break;
            default:
                    System.out.println("Вы ошиблись вводом");
        }
    }
}

