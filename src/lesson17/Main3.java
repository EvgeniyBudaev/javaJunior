package lesson17;

import org.apache.log4j.Logger;

public class Main3 {
    private static final Logger logger = Logger.getLogger(Main3.class);
    public static void main(String[] args) {
        String name = null;
        if(name != null){
            //System.out.println("111");
            logger.info("111");
        } else
            logger.info("0");
            //System.out.println("0");


    }
}
