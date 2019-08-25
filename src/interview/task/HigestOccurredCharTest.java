package interview.task;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class HigestOccurredCharTest {
    public static void main(String[] args) {
        System.out.println("Enter the char string to check higest occurrence");
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        if(str != null && !str.isEmpty()){
            Map<Character, Integer> map = countOccurrence(str);
            getHigestOccurrenceChar(map);
        }else{
            System.out.println("enter valid string");
        }
    }

    public static Map<Character, Integer> countOccurrence(String str){
        char strArr[] = str.toCharArray();
        Map<Character, Integer> map = new HashMap<Character , Integer>();
        for (Character ch : strArr) {
            if(map.containsKey(ch)){
                map.put(ch, map.get(ch)+1);
            }else{
                map.put(ch, 1);
            }
        }
        return map;
    }

    public static void getHigestOccurrenceChar(Map<Character, Integer> map){
        Character ch = null;
        Integer no = 0;
        Set<Map.Entry<Character, Integer>> entrySet = map.entrySet();
        for (Map.Entry<Character, Integer> entry : entrySet) {
            if(no != 0 && ch != null){
                if(entry.getValue() > no){
                    no = entry.getValue();
                    ch = entry.getKey();
                }
            }else{
                no = entry.getValue();
                ch = entry.getKey();
            }


        }
        System.out.println(ch+ " Higest occurrence char is "+ no);
    }

}
