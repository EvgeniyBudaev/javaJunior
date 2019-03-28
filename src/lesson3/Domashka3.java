package lesson3;  // не работает

public class Domashka3 { // Есть два дробных числа. Находим наименьший общий знаменатель. В нашем случае это 24.
    public static void main(String[] args) {



        int[] kolichestvoZnamenatelei = {6, 8};
        int max = kolichestvoZnamenatelei[0];
        for (int i = 1; i < kolichestvoZnamenatelei.length; i++) {
            max = Math.max(max, kolichestvoZnamenatelei[i]);
            System.out.println(max);
        }
        int mn = 1;
        int noz = max;
        noz *= mn;
        boolean nozNaiden = true;
        for(int i=0;i< kolichestvoZnamenatelei.length;i++){
        if (max % kolichestvoZnamenatelei.length !=0)
            nozNaiden = false;
        }
        if(nozNaiden)
            return ;
            mn++;
            nozNaiden = true;

    }
}




