package lesson16;

import java.util.HashSet;
import java.util.TreeSet;

public class SortingTovars {

    public static void sortByPrice(HashSet<Tovar> tovars) throws NullPointerException{
        if (tovars == null){
            throw new NullPointerException("tovar is null");
        }
        TreeSet<Tovar> result = new TreeSet<>();
        result.addAll(tovars);

        for (Tovar t : result) {
            System.out.println(t);
        }
    }

    public static void sortByPriceReverse(HashSet<Tovar> tovars) throws NullPointerException{
        if (tovars == null){
            throw new NullPointerException("tovar is null");
        }
        TreeSet<Tovar> result = new TreeSet<>(new PriceReverse());
        result.addAll(tovars);

        for (Tovar t : result) {
            System.out.println(t);
        }
    }

    public static void sortByCount(HashSet<Tovar> tovars) throws NullPointerException{
        if (tovars == null){
            throw new NullPointerException("tovar is null");
        }
        TreeSet<Tovar> result = new TreeSet<>(new SortCount());
        result.addAll(tovars);

        for (Tovar t : result) {
            System.out.println(t);
        }
    }

    public static void sortByReiting(HashSet<Tovar> tovars) throws NullPointerException{
        if (tovars == null){
            throw new NullPointerException("tovar is null");
        }
        TreeSet<Tovar> result = new TreeSet<>(new SortReiting());
        result.addAll(tovars);

        for (Tovar t : result) {
            System.out.println(t);
        }
    }

        public static void sortByView(HashSet<Tovar> tovars) throws NullPointerException{
            if (tovars == null){
                throw new NullPointerException("tovar is null");
            }
            TreeSet<Tovar> result = new TreeSet<>(new SortView());
            result.addAll(tovars);

            for (Tovar t : result) {
                System.out.println(t);
            }
    }

    public static void sortByReview(HashSet<Tovar> tovars) throws NullPointerException{
        if (tovars == null){
            throw new NullPointerException("tovar is null");
        }
        TreeSet<Tovar> result = new TreeSet<>(new SortReview());
        result.addAll(tovars);

        for (Tovar t : result) {
            System.out.println(t);
        }
    }

    public static void sortByName(HashSet<Tovar> tovars) throws NullPointerException{
        if (tovars == null){
            throw new NullPointerException("tovar is null");
        }

        TreeSet<Tovar> result = new TreeSet<>(new SortName());
        result.addAll(tovars);

        for (Tovar t : result) {
            System.out.println(t);
        }
    }

    public static void sortByReitingReverse(HashSet<Tovar> tovars) throws NullPointerException{
        if (tovars == null){
            throw new NullPointerException("tovar is null");
        }
        TreeSet<Tovar> result = new TreeSet<>(new SortReitingReverse());
        result.addAll(tovars);

        for (Tovar t : result) {
            System.out.println(t);
        }
    }

    public static void sortByViewReverse(HashSet<Tovar> tovars) throws NullPointerException{
        if (tovars == null){
            throw new NullPointerException("tovar is null");
        }
        TreeSet<Tovar> result = new TreeSet<>(new SortViewReverse());
        result.addAll(tovars);

        for (Tovar t : result) {
            System.out.println(t);
        }
    }

    public static void sortByReviewReverse(HashSet<Tovar> tovars) throws NullPointerException{
        if (tovars == null){
            throw new NullPointerException("tovar is null");
        }
        TreeSet<Tovar> result = new TreeSet<>(new SortReviewReverse());
        result.addAll(tovars);

        for (Tovar t : result) {
            System.out.println(t);
        }
    }

    public static void sortByNameReverse(HashSet<Tovar> tovars) throws NullPointerException{
        if (tovars == null){
            throw new NullPointerException("tovar is null");
        }
        TreeSet<Tovar> result = new TreeSet<>(new SortNameReverse());
        result.addAll(tovars);

        for (Tovar t : result) {
            System.out.println(t);
        }
    }

    public static void sortByCountReverse(HashSet<Tovar> tovars) throws NullPointerException{
        if (tovars == null){
            throw new NullPointerException("tovar is null");
        }
        TreeSet<Tovar> result = new TreeSet<>(new SortCountReverse());
        result.addAll(tovars);

        for (Tovar t : result) {
            System.out.println(t);
        }
    }

}