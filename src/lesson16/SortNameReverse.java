package lesson16;

import java.util.Comparator;

public class SortNameReverse implements Comparator<Tovar> {
    @Override
    public int compare(Tovar o1, Tovar o2) {
        if (o1.getName() != o2.getName()) {
            return o2.getName().compareTo(o1.getName());
        }

        if (o1.getReview() != o2.getReview()) {
            return o2.getReview() - o1.getReview();
        }

        if (o1.getView() != o2.getView()) {
            return o2.getView() - o1.getView();
        }

        if (o1.getReiting() != o2.getReiting()) {
            return o2.getReiting() - o1.getReiting();
        }

        if (o1.getBuyCount() != o2.getBuyCount()) {
            return o2.getBuyCount() - o1.getBuyCount();
        }
        return o2.getPrice() - o1.getPrice();
    }
}
