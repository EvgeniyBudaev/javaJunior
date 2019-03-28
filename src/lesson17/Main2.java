package lesson17;

public class Main2 {
    public static void main(String[] args) {
        Holodilnik holodilnik = new Holodilnik();

        try{
            holodilnik.addProduct(null, 2);
        } catch (NullPointerException e) {
            System.out.println("Пустой продукт!");
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
