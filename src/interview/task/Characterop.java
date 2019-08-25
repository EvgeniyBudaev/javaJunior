package interview.task;

import java.util.LinkedHashMap;
import java.util.Map;

public class Characterop {
    public void maxOccur(String ip)
    {

        LinkedHashMap<Character, Integer> hash = new LinkedHashMap();
        for(int i = 0; i<ip.length();i++)
        {
            char ch = ip.charAt(i);
            if(hash.containsKey(ch))
            {
                hash.put(ch, (hash.get(ch)+1));

            }
            else
            {
                hash.put(ch, 1);
            }
        }

        //Set set = hash.entrySet();
        Map.Entry<Character, Integer> maxEntry = null;
        for(Map.Entry<Character,Integer> entry : hash.entrySet())
        {
            if(maxEntry == null)
            {
                maxEntry = entry;
            }

            else if(maxEntry.getValue() < entry.getValue())
            {
                maxEntry = entry;
            }
        }
        System.out.println(maxEntry.getKey());


    }
}
