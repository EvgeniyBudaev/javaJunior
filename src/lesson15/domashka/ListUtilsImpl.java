package lesson15.domashka;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.TreeSet;

public class ListUtilsImpl implements ListUtils {
    @Override
    public List<String> asList(String... strings) throws IllegalArgumentException {
        if(strings == null){
            throw new IllegalArgumentException("This strings is null");
        }
        return Arrays.asList(strings);
    }

    @Override
    public List<Double> sortedList(List<Double> data) throws IllegalArgumentException {
        if(data == null){
            throw new IllegalArgumentException("This data is null");
        }
//        for (int i = data.size() - 1; i >= 0; i--) {          //Вывод результата на консоль в обратном порядке
//            System.out.print(data.get(i) + "  ");
//        }
        TreeSet<Double> res = new TreeSet<>();
        res.addAll(data);

        ArrayList<Double> currentResult = new ArrayList<>();
        currentResult.addAll(res);

        ArrayList<Double> result1 = new ArrayList<>();
        for (int i = currentResult.size() - 1; i >= 0; i--) {
            result1.add(currentResult.get(i));
        }

        return result1;
    }

    @Override
    public String toString() {
        return "ListUtilsImpl{}";
    }

}
