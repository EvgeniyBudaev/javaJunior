package lesson15;

import org.apache.log4j.Logger;

import java.util.Iterator;
import java.util.TreeSet;

public class Main3 {
    private static final Logger logger = Logger.getLogger(Main3.class);
    public static void main(String[] args) {
        TreeSet<Integer> strings = new TreeSet<>();
        strings.add(8);
        strings.add(13);
        strings.add(6);
        strings.add(14);
        strings.add(13);

//        for(String s:strings){ //проход по коллекции HashSet
//            System.out.println(s);
//        }

        for(Iterator<Integer> iter = strings.iterator(); iter.hasNext();){
            //System.out.println(iter.next());
            logger.info(iter.next());
        }
    }
}
