package lesson1;

import org.apache.log4j.Logger;

public class Main8 { // Конвертер из градусов Цельсия в градусы Фаренгейт
    private static final Logger logger = Logger.getLogger(Main8 .class);
    public static void main(String[] args) {

        //System.out.println(convertCelsiumToFahrenheit(41));
        logger.info(convertCelsiumToFahrenheit(41));
    }

    public static double convertCelsiumToFahrenheit(int celsium) {
        double fahrenheit = (celsium * 1.8) + 32;//напишите тут ваш код

        return fahrenheit;
    }
}