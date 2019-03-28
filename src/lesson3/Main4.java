package lesson3;

public class Main4 { // Пример работы с continue
    public static void main(String[] args) {
        for (int i = 10; i < 31; i++) {
            if (i > 20 && i < 25) {
                continue;

            }
            System.out.println(i);
        }
    }
}
