package lesson17;

import org.apache.log4j.Logger;

public class Main2 {
    private static final Logger logger = Logger.getLogger(Main2.class);
    public static void main(String[] args) {
        Holodilnik holodilnik = new Holodilnik();

        try{
            holodilnik.addProduct(null, 2);
        } catch (NullPointerException e) {
            logger.info("Пустой продукт!");
            //System.out.println("Пустой продукт!");
        }
        holodilnik.addProduct("яблоко", 2);
        holodilnik.addProduct("яблоко", 1);
        holodilnik.addProduct("груша", 3);
        holodilnik.addProduct("слива", 1);
        holodilnik.addProduct("сливки", 4);

        holodilnik.deleteProduct("груша", 3);
        System.out.println();

        holodilnik.printListProduct();
        System.out.println();
    }
}
