package lesson15.domashka;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        //Выполнение 1-й задачи
        ListUtilsImpl l = new ListUtilsImpl();
        try{
            l.asList(null);
        }catch (IllegalArgumentException e){
            System.out.println("String is null");
        }
        ListUtilsImpl list = new ListUtilsImpl();
        List<String> result = list.asList("aaaa", "bbbb", "cccc");
        System.out.println(result);

        //Выполнение 2-й задачи
        try{
            l.sortedList(null);
        }catch (IllegalArgumentException e){
            System.out.println("Data is null");
        }
        ArrayList<Double> data = new ArrayList<>();
        data.add(14.0);
        data.add(3.0);
        data.add(2019.0);

        List<Double> result2 = list.sortedList(data);
        System.out.println(result2);

        //Выполнение 3-й задачи
        SetUtilsImpl s = new SetUtilsImpl();
        try{
            s.orderedSet(null, null);
        }catch (NullPointerException e){
            System.out.println("This collection || set2 are null");
        }

        LinkedHashSet<Integer> collection1 = new LinkedHashSet<>();
        collection1.add(1);
        collection1.add(2);
        collection1.add(3);

        LinkedHashSet<String> set2 = new LinkedHashSet<>();
        set2.add("4");
        set2.add("5");
        set2.add("6");

        SetUtilsImpl ordered = new SetUtilsImpl();
        SortedSet<String> result3 = ordered.orderedSet(collection1, set2);
        System.out.println(result3);

        //Выполнение 4-й задачи
        Set<Integer> result4 = ordered.customOrderSet(10,20,30,40,50);
        System.out.println(result4);

    }
}
