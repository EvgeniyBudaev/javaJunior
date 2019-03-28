package lesson4;

public class Domashka2 { // Входящие параметры; int count, int print.
                         // Метод должен напечатать столько раз число print, сколько указали мы в переменнной count.
    public static void main(String[] args) {
        int print = getPrint(2);
        for (int i = 0; i < print; i++) {
            System.out.println(print);
        }
    }
    public static int getPrint(int count) {
        for (int i = 0; i < count; i++) {

        }
        return count;
    }
}
