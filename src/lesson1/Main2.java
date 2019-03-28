package lesson1;

public class Main2 {
    public static void main(String[] args) {
        int koshelek = 1000, igrushkaSell = 175, rezinkaSell = 11, konfetaSell = 2;

        int igrushkaBuy = koshelek / igrushkaSell;
        int ostatokDenegPosleIgrushek = koshelek - (igrushkaBuy * igrushkaSell);
        int rezinkaBuy = ostatokDenegPosleIgrushek / rezinkaSell;
        int ostatokDenegPosleRezinok = ostatokDenegPosleIgrushek - (rezinkaBuy * rezinkaSell);
        int konfetaBuy = ostatokDenegPosleRezinok / konfetaSell;


        System.out.println(" Кол-во купленных игрушек: " + igrushkaBuy + " Кол-во купленных резинок: " + rezinkaBuy +
                " Кол-во купленных конфет:" + konfetaBuy);



    }
}
