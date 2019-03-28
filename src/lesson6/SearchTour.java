package lesson6;

public class SearchTour {

    public static void printTourByCountry(String country, String[][] tours) {
        for (int i = 0; i < tours.length; i++) {
            if (country.equalsIgnoreCase(tours[i][0])) {
                System.out.println(tours[i][0] + ", цена - " + tours[i][1] + ", " + tours[i][2] + ", " + tours[i][3] +
                        ", " + tours[i][4]);
            }
        }
    }

    public static void printTourByZvezd(String zvezd, String[][] tours) {
        for (int i = 0; i < tours.length; i++) {
            if (zvezd.equalsIgnoreCase(tours[i][3])) {
                System.out.println(tours[i][3]);
            }
        }
    }
    //Работа с числами
    public static void printToursByPriceFrom (String priceFrom, String[][] tours){
        int priceFromNum = Integer.parseInt(priceFrom);
        for (int i = 0; i < tours.length; i++) {
            int priceTour = Integer.parseInt(tours[i][1]);
            if ( priceTour > priceFromNum) {
                System.out.println(tours[i][0] + ", цена - " + tours[i][1] + ", " + tours[i][2] + ", " + tours[i][3] +
                      ", " + tours[i][4]);
            }
        }

    }
}


