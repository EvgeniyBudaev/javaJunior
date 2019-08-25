package interview.krok;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array_int = new int[scanner.nextInt()];

        for (int i=0; i < array_int.length;i++) {
            array_int[i] = scanner.nextInt();
        }

        for (int n=1; n < array_int.length+1;n++) {
            System.out.println(n);
        }

    }
}
