package lesson4;

public class Domashka4 { // Входящие параметры - массив символов. Метод должен напечатать на консоль ЧЕРЕЗ символ, все символы, которые есть в массиве.
    public static void main(String[] args) {
        char[] symbols = {'a', 'b', 'c', 'd', 'e', 'f', 'g'};
        for (int i = 0; i < symbols.length; i++) {
            System.out.println(symbols[i]);
            i++;
        }
    }
}
