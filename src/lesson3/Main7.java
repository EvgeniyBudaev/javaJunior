package lesson3;

public class Main7 { // Сумма чисел в масиве от 0 до 6 со значениями ячеек внутри масива 7,10,13,-1,2,-2,80. Вывод =109.
    public static void main(String[] args) {
        int summa = 0;
        int[] numbers = {7, 10 ,13, -1, 2, -2, 80};

        for (int i = 0; i < numbers.length; i++) {
            summa = summa + numbers[i];

        }
        System.out.println(summa);
    }
}
