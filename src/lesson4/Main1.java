package lesson4;

public class Main1 {
    public static void main(String[] args) {
      int result = MathFunction.summaTrehChisel(4, 7, 9);
        System.out.println(result);

       double itogo =  MathFunction.summaVklada(10000, 9, 7);
        System.out.println(itogo);

        double ploshad =  MathFunction.ploshadtreygolnika(5, 7, 10);
        System.out.println(ploshad);

        int[] rate = {2, 3, 8, 5, 9};
        MassivRate.peredacha(rate);

    }
}
