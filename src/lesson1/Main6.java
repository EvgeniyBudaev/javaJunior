package lesson1;

import org.apache.log4j.Logger;

public class Main6 { // Увеличиваем зарплату на 100
    private static final Logger logger = Logger.getLogger(Main6.class);

    public static void main(String[] args) {

        hackSalary(700);
    }

    public static void hackSalary(int a) {
        a += 100;
        System.out.println("Твоя зарплата составляет: " + a + " долларов в месяц.");
        logger.info("Твоя зарплата составляет: " + a + " долларов в месяц.");
    }
}





