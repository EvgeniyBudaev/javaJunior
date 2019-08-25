package Podgotovka.Collections;

import java.util.Comparator;

public class SortYear implements Comparator<Car> {
    @Override
    public int compare(Car o1, Car o2) {
        if(o1.getYear() != o2.getYear()){
            return o1.getYear() - o2.getYear();
        }

        return o1.getColor().compareTo(o2.getColor());
    }
}
