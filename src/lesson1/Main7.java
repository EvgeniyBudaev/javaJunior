package lesson1;

import org.apache.log4j.Logger;

public class Main7 { // Считаем длину окружности
    private static final Logger logger = Logger.getLogger(Main7.class);

    public static void main(String[] args) {
        printCircleLength(5);
    }

    public static void printCircleLength(int radius) {
        double printCircleLength = 2 * 3.14 * radius; //напишите тут ваш код
        //System.out.println(printCircleLength);
        logger.info(printCircleLength);
    }
}
