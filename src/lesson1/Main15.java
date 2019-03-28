package lesson1;

public class Main15 {
    public static void main(String[] args) {
        int chis1 = 1;
        int znam1 = 8;
        int chis2 = 2;
        int znam2 = 6;
        double x = chis1 / znam1;
        double y = chis2 / znam2;
        int max;

        if (znam1 > znam2){
            max = znam1;
        }
        else max = znam2;
        System.out.println(max);

        int mn = 1;
        int noz = max;
        noz *= mn;

        int[] kolichestvoZnamenatelei = {znam1, znam2};
        boolean nozNaiden = true;
        for(int i=0;i< kolichestvoZnamenatelei.length;i++){
            if (max % kolichestvoZnamenatelei.length !=0) {
                nozNaiden = false;
            }
            if(nozNaiden) {
                return; }
                mn++;
                nozNaiden = true;
            System.out.println(nozNaiden);
        }
        System.out.println(nozNaiden);


    }
}