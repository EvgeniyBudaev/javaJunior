package lesson1;

import org.apache.log4j.Logger;

public class Main4 {
    private static final Logger logger = Logger.getLogger(Main4.class);

    public static void main(String[] args) {
        int a = 5, b = 7, c = 10; // стороны треугольника
        int p = (a + b + c) / 2; // полупериметр треугольника
        int podKornem = p * (p - a) * (p - b) * (p - c); // Площадь треугольника по формуле Герона S=√p(p−a)(p−b)(p−c).

        double s = Math.sqrt(podKornem); // Вычисление площади треугольника по формуле

        //System.out.println(" Площадь треугольника равна: " + s);
        logger.info(" Площадь треугольника равна: " + s);
    }
}
