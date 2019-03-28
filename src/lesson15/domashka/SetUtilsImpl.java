package lesson15.domashka;

import java.util.*;

public class SetUtilsImpl implements SetUtils {
    @Override
    public SortedSet<String> orderedSet(Collection<Integer> collection1, Set<String> set2) throws NullPointerException {
        if(collection1 == null){
            throw new NullPointerException("This collection1 is null");
        }
        if(set2 == null){
            throw new NullPointerException("This set2 is null");
        }
        TreeSet<String> result = new TreeSet<>(Collections.reverseOrder() ); //Collections.reverseOrder() - выводит в обратном порядке
        for(Integer num:collection1){
            String s = String.valueOf(num); //result.add(Integer.toString(num));
            result.add(s);
        }
        result.addAll(set2);

        return  result;
    }

    @Override
    public Set<Integer> customOrderSet(int val1, int val2, int val3, int val4, int val5) {
        Set<Integer> result = new LinkedHashSet<>();
        result.add(val1);
        result.add(val2);
        result.add(val3);
        result.add(val4);
        result.add(val5);
        return result;
    }

}
