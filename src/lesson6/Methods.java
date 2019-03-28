package lesson6;

public class Methods {
    //Выбираем страну
    public static void printTourByCountry(String country, String[][] tours) {
        for (int i = 0; i < tours.length; i++) {
            if (country.equalsIgnoreCase(tours[i][0])) {
                System.out.println(tours[i][0] + ", цена - " + tours[i][1] + ", " + tours[i][2] + ", " + tours[i][3] +
                        ", " + tours[i][4] + ", " + tours[i][5] + ", " + tours[i][6]);
            }
        }
    }
    // 1.Напечатать на консоль все туры только на 7 дней
    public static void printTourByDays(String days, String[][] tours) {
        for (int i = 0; i < tours.length; i++) {
            if (days.equalsIgnoreCase(tours[i][2])) {
                System.out.println(tours[i][0] + ", цена - " + tours[i][1] + ", " + tours[i][2] + " дней ");
            }
        }
    }
    // 2. Напечатать на консоль все туры только на Пансионат тип.
    public static void printTourByOption(String option, String[][] tours) {
        for (int i = 0; i < tours.length; i++){
            if (option.equalsIgnoreCase(tours[i][6])){
                System.out.println(tours[i][0] + ", цена - " + tours[i][1] + ", " + tours[i][2] + ", " + tours[i][3] +
                        ", " + tours[i][4] + ", " + tours[i][5] + ", " + tours[i][6]);
            }
        }
    }
    // 3.Напечатать на консоль все туры, стоимость которых ниже, чем та, которую мы передаем в метод параметром
    public static void printTourByPrice(String priceFrom, String[][] tours){
        int priceFromNum = Integer.parseInt(priceFrom);
        for (int i = 0; i < tours.length; i++){
            int priceTour = Integer.parseInt(tours[i][1]);
            if (priceTour < priceFromNum){
                System.out.println(tours[i][0] + ", цена - " + tours[i][1]);
            }
        }
    }
    // 4.Напечатать на консоль сумму СТОИМОСТЕЙ всех туров что у нас есть
    public static void sumTours(String[][] tours) {
        int summa = 0;
        for (int i = 0; i < tours.length; i++) {
            int priceTour = Integer.parseInt(tours[i][1]);
            summa = summa + priceTour;
        }
        System.out.println(summa);
    }
}
