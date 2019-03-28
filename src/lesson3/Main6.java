package lesson3;

public class Main6 {
    public static void main(String[] args) {
        int[] numbers = new int[7];

        /*numbers[0] = 2;
        numbers[1] = 3;
        numbers[2] = 4;
        numbers[3] = 5;
        numbers[4] = 6;
        numbers[5] = 7;
        numbers[6] = 8; */

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i +2;
        }

            for (int i = 0; i < numbers.length; i++) {
                System.out.println(numbers[i]);
            }

        }
    }

