package lesson5;

public class Domashka1 { //Создать двумерный массив чисел, заполнить его (произвольно). Вывести на консоль только те ячейки,
                         // в которых кратные числа, а вместо остальных чисел вывести пустое место (пробел).

    public static void main(String[] args) {
        int[][] p = {{6, 5, 9, 7,12, 13, 14},{8, 7, 4, 3, 15, 18, 19}};
        for (int i = 0; i < p.length; i++){
            for (int j = 0; j < p[i].length; j++) {
                if (p[i][j] % 2==0) {
                    System.out.print(p[i][j] + " ");
                }
                else
                    System.out.print(" " + " ");
            }
            System.out.println();
        }
    }
}
