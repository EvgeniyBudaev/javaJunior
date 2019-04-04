package lesson16;

import org.apache.log4j.Logger;

import java.util.HashSet;

public class Main {
    private static final Logger logger = Logger.getLogger(Main.class);
    public static void main(String[] args) {
        HashSet<Tovar> tovars = new HashSet<>();

        try {
            SortingTovars.sortByPrice(null);
            SortingTovars.sortByPriceReverse(null);
            SortingTovars.sortByName(null);
            SortingTovars.sortByCount(null);
            SortingTovars.sortByReiting(null);
            SortingTovars.sortByView(null);
            SortingTovars.sortByReview(null);
            SortingTovars.sortByReviewReverse(null);
            SortingTovars.sortByViewReverse(null);
            SortingTovars.sortByNameReverse(null);
            SortingTovars.sortByCountReverse(null);
        } catch (NullPointerException e){
            logger.info("нет товара!");
            //System.out.println("нет товара!");
        }

        Tovar tovar1 = new Tovar(18, 1000, "Мышка", 5, 7, 10);
        Tovar tovar2 = new Tovar(22, 500, "Мышка SteelSeries", 2, 4, 30);
        Tovar tovar3 = new Tovar(7, 3000, "Мышка", 4, 3, 7);
        Tovar tovar4 = new Tovar(63, 500, "Мышка Seageta", 3, 45, 19);
        Tovar tovar5 = new Tovar(2, 900, "Клава", 5, 7, 10);
        Tovar tovar6 = new Tovar(19, 1300, "Переходник", 1, 2, 4);

        tovars.add(tovar1);
        tovars.add(tovar2);
        tovars.add(tovar3);
        tovars.add(tovar4);
        tovars.add(tovar5);
        tovars.add(tovar6);
       // System.out.println(tovars);
        //System.out.println();
        //System.out.println("Сортировка по цене");
        logger.info("Сортировка по цене");
        SortingTovars.sortByPrice(tovars);
        System.out.println();

        //System.out.println("Сортировка по цене в обратном порядке");
        logger.info("Сортировка по цене в обратном порядке");
        SortingTovars.sortByPriceReverse(tovars);
        System.out.println();

        //System.out.println("Сортировка по количеству покупок");
        logger.info("Сортировка по количеству покупок");
        SortingTovars.sortByCount(tovars);
        System.out.println();

        //System.out.println("Сортировка по рейтингу");
        logger.info("Сортировка по рейтингу");
        SortingTovars.sortByReiting(tovars);
        System.out.println();

        //System.out.println("Сортировка по количеству просмотров");
        logger.info("Сортировка по количеству просмотров");
        SortingTovars.sortByView(tovars);
        System.out.println();

        //System.out.println("Сортировка по количеству обзоров");
        logger.info("Сортировка по количеству обзоров");
        SortingTovars.sortByReview(tovars);
        System.out.println();

        //System.out.println("Сортировка по названию");
        logger.info("Сортировка по названию");
        SortingTovars.sortByName(tovars);
        System.out.println();

        //System.out.println("Сортировка по рейтингу в обратном порядке");
        logger.info("Сортировка по рейтингу в обратном порядке");
        SortingTovars.sortByReitingReverse(tovars);
        System.out.println();

        //System.out.println("Сортировка по количеству просмотров в обратном порядке");
        logger.info("Сортировка по количеству просмотров в обратном порядке");
        SortingTovars.sortByViewReverse(tovars);
        System.out.println();

        //System.out.println("Сортировка по количеству обзоров в обратном порядке");
        logger.info("Сортировка по количеству обзоров в обратном порядке");
        SortingTovars.sortByReviewReverse(tovars);
        System.out.println();

        //System.out.println("Сортировка по названию в обратном порядке");
        logger.info("Сортировка по названию в обратном порядке");
        SortingTovars.sortByNameReverse(tovars);
        System.out.println();

        //System.out.println("Сортировка по количеству покупок в обратном порядке");
        logger.info("Сортировка по количеству покупок в обратном порядке");
        SortingTovars.sortByCountReverse(tovars);
        System.out.println();


    }
}
