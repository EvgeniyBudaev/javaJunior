package lesson15;

import java.util.HashSet;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        HashSet<String> strings = new HashSet<>();
        strings.add("qwerty");
        strings.add("wwwww");
        strings.add("sssss");
        strings.add("dddddd");
        strings.add("eeeee");

//        for(String s:strings){ //проход по коллекции HashSet
//            System.out.println(s);
//        }

        for(Iterator<String> iter = strings.iterator();iter.hasNext();){
            System.out.println(iter.next());
        }


    }
}
