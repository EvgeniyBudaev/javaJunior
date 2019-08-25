package Podgotovka.Collections;
// Сортировка
import java.util.ArrayList;
import java.util.HashSet;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("жигули", 2005, "баклажан");
        Car car2 = new Car("мерседес", 2018, "черная");
        Car car3 = new Car("тайота", 2018, "серебристая");
        Car car4 = new Car("тайота", 2018, "серебристая");
        Car car5 = new Car("бмв", 2014, "красная");

        ArrayList<Car> cars = new ArrayList<>();
        cars.add(car1);
        cars.add(car2);
        cars.add(car3);
        cars.add(car4);
        cars.add(car5);

        SortingCars.sortByName(cars);
        System.out.println();
        SortingCars.sortByYear(cars);

        System.out.println("---------------------");

        TreeSet<Car> cars2 = new TreeSet<>();
        cars2.add(car1);
        cars2.add(car2);
        cars2.add(car3);
        cars2.add(car4);
        cars2.add(car5);

        for(Car c2: cars2){
            System.out.println(c2);
        }

        System.out.println("---------------------");

        HashSet<Car> cars3 = new HashSet<>();
        cars3.add(car1);
        cars3.add(car2);
        cars3.add(car3);
        cars3.add(car4);
        cars3.add(car5);

        for(Car c3: cars3){
            System.out.println(c3);
        }

    }
}

