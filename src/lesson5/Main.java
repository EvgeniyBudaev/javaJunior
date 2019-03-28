package lesson5;

public class Main {
    public static void main(String[] args) {
        int[][] numbers = {{2,4,7,7},{2,5,8,3}}; // Двумерный массив.
//        System.out.print(numbers[0][0] + " ");
//        System.out.print(numbers[0][1] + " ");
//        System.out.print(numbers[0][2] + " ");
//        System.out.print(numbers[0][3] + " ");
//
//        System.out.println();
//        System.out.print(numbers[1][0] + " ");
//        System.out.print(numbers[1][1] + " ");
//        System.out.print(numbers[1][2] + " ");
//        System.out.print(numbers[1][3] + " ");

        for (int i = 0; i < numbers.length; i++) { //(int i = numbers.length-1; i >= 0; i--) в обратном порядке
            for (int j = 0; j < numbers[i].length; j++) { //(int j = numbers[i].length-1; j >= 0; j--) в обратном порядке
                System.out.print(numbers[i][j] + " ");
            }
            System.out.println();
        }
    }
}
