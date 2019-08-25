package interview.task13;
// Реализовать метод, который на вход принимает строку, а возвращает объект, в котором будет содержаться информация о том,
// какой символ наиболее часто встретился на входной строке, а также сколько раз он там встретился.

import java.util.Map;

public class Main {
    public static <K, V> void main(String[] args) {
        TheMostCommonSymbol str = new TheMostCommonSymbol();
        Map<Character, Integer> res = str.method("aaaAAbc ffffff");

        System.out.println("Максимальное количество вхождений: " + res);
//        for(Map.Entry<Character, Integer> occurrences: res.entrySet()){
//            System.out.println(occurrences.getKey());
//            Character key = occurrences.getKey();
//            Integer value = occurrences.getValue();
//            System.out.println(key + " " + value);
//        }



    }
}
