package interview.task1;

import java.util.*;

public class Realization {
    private String text;


    public Realization() {
    }

    public Realization(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Map<Character, Integer> method(String text) {
        char strArr[] = text.toCharArray();
        Map<Character, Integer> map = new HashMap<Character, Integer>();
        for (Character ch : strArr) {
            if (map.containsKey(ch)) {
                map.put(ch, map.get(ch) + 1);
            } else {
                map.put(ch, 1);
            }
        }
            return map;

    }

    public static void getHigestOccurrenceChar(Map<Character, Integer> map) {
        Character ch = null;
        Integer no = 0;
        Set<Map.Entry<Character, Integer>> entrySet = map.entrySet();
        for (Map.Entry<Character, Integer> entry : entrySet) {
            if (no != 0 && ch != null) {
                if (entry.getValue() > no) {
                    no = entry.getValue();
                    ch = entry.getKey();
                }
            } else {
                no = entry.getValue();
                ch = entry.getKey();
            }
        }
        System.out.println("Наиболее встречающийся символ в строке: " + ch + " (в количестве " + no + " раз)");
    }

}