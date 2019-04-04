package lesson1;

import org.apache.log4j.Logger;

public class Main1 {
    private static final Logger logger = Logger.getLogger(Main1.class);
    public static void main(String[] args) {
        int shirinaRoom = 6;
        int dlinnaRoom = 15;
        int shirinaStola = 2;
        int dlinnaStola = 3;

        int kolichestvoStolov = (shirinaRoom * dlinnaRoom) / (shirinaStola * dlinnaStola);

               //System.out.println("Количество столов в комнате: " + kolichestvoStolov);
        logger.info("Количество столов в комнате: " + kolichestvoStolov);
    }
}
