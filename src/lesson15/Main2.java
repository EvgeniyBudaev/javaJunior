package lesson15;

import org.apache.log4j.Logger;

import java.util.HashSet;
import java.util.TreeSet;

public class Main2 {
    private static final Logger logger = Logger.getLogger(Main2.class);
    public static void main(String[] args) {
        Coin coin1 = new Coin(2.5, 1990, 2);
        Coin coin2 = new Coin(2.5, 1990, 2);
        Coin coin3 = new Coin(5.0, 2018, 50);
        Coin coin4 = new Coin(3.5, 2006, 10);
        Coin coin5 = new Coin(3.0, 2006, 5);

        HashSet<Coin> coins = new HashSet<>();
        coins.add(coin1);
        coins.add(coin2);
        coins.add(coin3);
        coins.add(coin4);
        coins.add(coin5);

        TreeSet<Coin> coins2 = new TreeSet<>();
        coins2.add(coin1);
        coins2.add(coin2);
        coins2.add(coin3);
        coins2.add(coin4);
        coins2.add(coin5);


        for(Coin coin:coins){
            //System.out.println(coin);
            logger.info(coin);
        }
        System.out.println();

        for(Coin coin:coins2){
            //System.out.println(coin);
            logger.info(coin);
        }
    }
}
