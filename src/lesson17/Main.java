package lesson17;

import org.apache.log4j.Logger;

import java.util.HashMap;
import java.util.Set;

public class Main {
    private static final Logger logger = Logger.getLogger(Main.class);
    public static void main(String[] args) {
        HashMap<String, Integer> holodilnik = new HashMap<>();
        holodilnik.put("Apple", 2); //apple - это ключ
        holodilnik.put("Peach", 3);
        holodilnik.put("Orange", 1);

        holodilnik.put("Banan", 4);
        holodilnik.put("Grape", 5);
        holodilnik.put("Apple", 3);
        //System.out.println(holodilnik);
        logger.info(holodilnik);

        Set<String> nameProduct = holodilnik.keySet();
        for(String product: nameProduct){
            System.out.println(product);
//            logger.info(holodilnik);
        }
    }
}
