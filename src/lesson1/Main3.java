package lesson1;

import org.apache.log4j.Logger;

public class Main3 {
    private static final Logger logger = Logger.getLogger(Main3.class);

    public static void main(String[] args) {
        int yashikS = 100, yashikL = 100, yashikH = 100; // S-ширина ящика, L - длина ящика, H - высота ящика
        int yashikV = yashikS * yashikL * yashikH;
        int kybikS = 50, kybikL = 50, kybikH = 50; // S-ширина кубика, L - длина кубика, H - высота кубика
        int kybikV = kybikS * kybikL * kybikH;

        int kolichestvoKybikov = yashikV / kybikV;

        //System.out.println(" Кол-во кубиков в ящике: " + kolichestvoKybikov);
        logger.info(" Кол-во кубиков в ящике: " + kolichestvoKybikov);

    }
}
