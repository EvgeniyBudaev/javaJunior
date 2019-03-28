package lesson5;
// Создать двумерный массив чисел, заполнить его (произвольно). Посчитать и вывести на консоль сумму всех ячеек.
public class Domashka2 {
    public static void main(String[] args) {
        int[][] p = {{2, 3, 5},{7, 2, 1}};
        int summa = 0;

        for (int i = 0; i < p.length; i++) {
            for (int j = 0; j < p[i].length; j++) {
                summa = summa+ p[i][j];
            }
        }
        System.out.print(summa + " ");
    }
}

