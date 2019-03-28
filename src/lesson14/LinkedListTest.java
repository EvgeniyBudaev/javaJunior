package lesson14;

import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedListTest {
    public static void main(String[] args) {
        LinkedList<String> collections = new LinkedList<>();
        ArrayList<String> collections2 = new ArrayList<>();

        long startTime = System.currentTimeMillis();
        for(int i = 0; i < 100000; i++){
            collections.add("qwerty" + i);
        }
        long endTime = System.currentTimeMillis();
        System.out.println(endTime - startTime);

        long startTime2 = System.currentTimeMillis();
        for(int i = 0; i < 100000; i++){
            collections2.add("qwerty" + i);
        }
        long endTime2 = System.currentTimeMillis();
        System.out.println(endTime2 - startTime2);
    }
}
