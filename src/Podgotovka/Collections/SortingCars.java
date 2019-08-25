package Podgotovka.Collections;

import java.util.ArrayList;
import java.util.TreeSet;

public class SortingCars {
    //базовая сортировка по названию
    public static void sortByName(ArrayList<Car> cars) throws NullPointerException{
        if (cars == null){
            throw new NullPointerException("car is null");
        }

        TreeSet<Car> result = new TreeSet<>();
        result.addAll(cars);

        for (Car c : result) {
            System.out.println(c);
        }
    }

    //Сортировка по годам
    public static void sortByYear(ArrayList<Car> cars) throws NullPointerException{
        if (cars == null){
            throw new NullPointerException("car is null");
        }

        TreeSet<Car> result = new TreeSet<>(new SortYear());
        result.addAll(cars);

        for (Car c : result) {
            System.out.println(c);
        }
    }
}
