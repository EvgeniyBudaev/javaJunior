package lesson4;

public class Domashka6 { //Найти и поместить в массив первых 7 чисел, которые делятся на 4 без остатка.
    public static void main(String[] args) {
        int masiv[] = new int[28];
        for (int i = 0; i < masiv.length; i++) {
            masiv[i] = i +4;
        }


        for (int i = 0; i < masiv.length; i++) {
            if (masiv[i] % 4 == 0) {
                int f = masiv[i];
                System.out.println(f);

            }
        }
    }
}
