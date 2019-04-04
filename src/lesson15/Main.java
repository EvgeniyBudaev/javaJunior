package lesson15;

import org.apache.log4j.Logger;

import java.util.HashSet;
import java.util.Iterator;

public class Main {
    private static final Logger logger = Logger.getLogger(Main.class);
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
            logger.info(iter.next());
            //System.out.println(iter.next());
        }


    }
}
