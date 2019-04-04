package lesson20;

import org.apache.log4j.Logger;

public class Main {
    private static final Logger logger = Logger.getLogger(Main.class); //этот объект создаем в каждом классе
    public static void main(String[] args) {
        logger.info("MESSAGE!!!!");
    }
}
