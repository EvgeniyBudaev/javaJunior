package lesson2;

public class Domashka4 { // Печатаем на консоль числа от 10 до 30, при этом не печатем числа: 21, 22, 23, 24
    public static void main(String[] args) {
        for (int i = 10; i < 31; i++) {
            if (i == 21 || i == 22 || i == 23 || i == 24) { // if (i < 21 || i > 24) { sout(i); }
            } else
                System.out.println(i);
        }
    }
}







