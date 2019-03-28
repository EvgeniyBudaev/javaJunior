package lesson3.homework;

public class HW1 { // Массив длинной из 10 символов. Выводим на консоль по одному символу из массива, начиная с конца в начало.
    public static void main(String[] args) {
        char[] simvols = {'w', 'c', 'd', 'e', 'i', 'o', 'q', 'z', 'x', 'v'};

        /*System.out.println(simvols[9]);
        System.out.println(simvols[8]);
        System.out.println(simvols[7]);
        System.out.println(simvols[6]);
        System.out.println(simvols[5]);
        System.out.println(simvols[4]);
        System.out.println(simvols[3]);
        System.out.println(simvols[2]);
        System.out.println(simvols[1]);
        System.out.println(simvols[0]); */

        for (int i = simvols.length - 1; i >= 0; i--) {
            System.out.println(simvols[i]);
        }
    }
}
