package lesson14;

import org.apache.log4j.Logger;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

public class Main1 {
    private static final Logger logger = Logger.getLogger(Main1.class);
    public static void main(String[] args) {
        ArrayList<Integer> num1 = new ArrayList<>();
        num1.add(1);
        num1.add(2);
        num1.add(3);
        num1.add(5);

        HashSet<Integer> num2 = new HashSet<>();
        num2.add(1);
        num2.add(7);
        num2.add(6);
        num2.add(5);

        CollectionUtilsImpl utils = new CollectionUtilsImpl();
        Collection<Integer> result1 = utils.union(num1, num2);
        //System.out.println(result1);
        logger.info(result1);

        Collection<Integer> result22 = utils.intersection(num1, num2);
        //System.out.println(result22);
        logger.info(result22);

        Collection<Integer> result33 = utils.unionWithoutDuplicate(num1, num2);
        //System.out.println(result33);
        logger.info(result33);

        Collection<Integer> result44 = utils.intersectionWithoutDuplicate(num1, num2);
        //System.out.println(result44);
        logger.info(result44);

        Collection<Integer> result55 = utils.difference(num1, num2);
        //System.out.println(result55);
        logger.info(result55);
    }
}
