package lesson4;

public class Domashka1 { // Входящие параметры: 4 целых числа. Метод должен напечатать на консоль меньшее число из этих четырех чисел.
    public static void main(String[] args) {
        int[] parametri = {6, 5, 9, 7};
        int min = parametri[0];
        int max = parametri[0];
        for (int i = 0; i < parametri.length; i++) {
            if (parametri[i] < min) {
                min = parametri[i];
                System.out.println("Минимальное: " + min);
                break;
            }
        }
    }
}
