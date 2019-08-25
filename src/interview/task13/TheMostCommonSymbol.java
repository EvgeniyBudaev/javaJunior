package interview.task13;

import java.util.HashMap;
import java.util.Map;

public class TheMostCommonSymbol {
    private String str;

    public TheMostCommonSymbol() {
    }

    public TheMostCommonSymbol(String str) {
        this.str = str;
    }

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }

    public Map<Character, Integer> method(String str){
        Map<Character, Integer> occurrences = new HashMap<>();

        char[] strArray = str.toCharArray();
        int index=1;
        int col=1;

        for (int i=0;i<strArray.length;i++){
            int colv=1;
            for (int j=i+1;j<strArray.length;j++){
                if (strArray[i]==strArray[j]){
                    colv++;
                }
            }
            if (colv>col){
                col=colv;
                index=i;
            }
        }
        occurrences.put(strArray[index], col);
//        System.out.println();
//        System.out.println("Максимальное количество вхождений: " + strArray[index] + ":" + col);
        return occurrences;
    }

}
