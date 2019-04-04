package lesson1;

import org.apache.log4j.Logger;

public class Main5 { //Проверяем стороны треугольника
    private static final Logger logger = Logger.getLogger(Main5.class);

    public static void main(String[] args) {
        int a = 5, b = 2, c = 5;

        if (a == b && b == c && a == c) {
            //System.out.println("Треугольник равносторонний");
            logger.info("Треугольник равносторонний");
        }
        if (a == b || b == c || a == c) {
            // System.out.println("Треугольник равнобедренный");
            logger.info("Треугольник равнобедренный");
        }
        if (a != b && b != c && a != c) {
            //System.out.println("Треугольник разносторонний");
            logger.info("Треугольник разносторонний");
        }
    }
}