package interview.task12;
// Реализовать метод, который на вход принимает строку, а возвращает объект, в котором будет содержаться информация о том,
// какой символ наиболее часто встретился на входной строке, а также сколько раз он там встретился.

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner s = new Scanner(System.in);
        String line = s.nextLine();

        Map<Character, Integer> occurrences = new HashMap<>();

        for (char c : line.toCharArray()) {
            if (Character.isLetter(c)) {
                if (!occurrences.containsKey(c))
                    occurrences.put(c, 1);
                else
                    occurrences.put(c, occurrences.get(c) + 1);
            }
        }

        int maxValueInMap = (Collections.max(occurrences.values()));
        for (Map.Entry<Character, Integer> entry : occurrences.entrySet()) {
            if (entry.getValue() == maxValueInMap) {
                System.out.println("Наиболее часто встречающаяся буква: " + entry.getKey());
                break;
            }
        }
    }
}
