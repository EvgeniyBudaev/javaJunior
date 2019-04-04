package lesson1;

import org.apache.log4j.Logger;

public class Main2 {
    private static final Logger logger = Logger.getLogger(Main2.class);

    public static void main(String[] args) {
        int koshelek = 1000, igrushkaSell = 175, rezinkaSell = 11, konfetaSell = 2;

        int igrushkaBuy = koshelek / igrushkaSell;
        int ostatokDenegPosleIgrushek = koshelek - (igrushkaBuy * igrushkaSell);
        int rezinkaBuy = ostatokDenegPosleIgrushek / rezinkaSell;
        int ostatokDenegPosleRezinok = ostatokDenegPosleIgrushek - (rezinkaBuy * rezinkaSell);
        int konfetaBuy = ostatokDenegPosleRezinok / konfetaSell;


        //System.out.println(" Кол-во купленных игрушек: " + igrushkaBuy + " Кол-во купленных резинок: " + rezinkaBuy +
        // " Кол-во купленных конфет:" + konfetaBuy);
        logger.info(" Кол-во купленных игрушек: " + igrushkaBuy);
        logger.info(" Кол-во купленных резинок: " + rezinkaBuy);
        logger.info(" Кол-во купленных конфет:" + konfetaBuy);
    }
}
