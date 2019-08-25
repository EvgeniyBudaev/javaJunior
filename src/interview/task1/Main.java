package interview.task1;


import java.util.Map;

import static interview.task1.Realization.getHigestOccurrenceChar;

// Реализовать метод, который на вход принимает строку, а возвращает объект, в котором будет содержаться информация о том,
// какой символ наиболее часто встретился на входной строке, а также сколько раз он там встретился.
public class Main {
    public static void main(String[] args) {
        Realization realization = new Realization();
        Map<Character, Integer> map = realization.method("ааааАббвг");
        getHigestOccurrenceChar(map);

    }
}
