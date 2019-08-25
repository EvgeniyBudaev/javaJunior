package interview.praim;
// Реализовать метод, который на вход принимает строку, а возвращает объект, в котором будет содержаться информация о том,
// какой символ наиболее часто встретился на входной строке, а также сколько раз он там встретился.

import java.util.Map;

public class Main {
    public static void main(String[] args) {
        TheMostCommonSymbol str = new TheMostCommonSymbol();
        try {
            Map<Character, Integer> res = str.method("Здесь передается какая-то строка");
            System.out.println("Максимальное количество вхождений символа: " + res);
        } catch (Exception e){
            System.out.println("Вы не передали строку!");
        }
    }
}
