package lesson7;

import java.util.Arrays;

public class StringUtils {

    public static String coddingMessage(String message){
        String alvafit = "abcdefghijklmnopqrstuvwxyz";
        char[] coddingMessage = message.toCharArray();
        for (int i = 0; i < coddingMessage.length; i++){
            int indexCurrentChar = alvafit.indexOf(coddingMessage[i]);
            if (indexCurrentChar != -1){
                char newChar = alvafit.charAt(indexCurrentChar + 1);
                coddingMessage[i] = newChar;
            }
        }
        return Arrays.toString(coddingMessage); //coddingMessage.toString();
    }

    public static int countGlasnie(String text){
        char[] textToChars = text.toCharArray();
        int count = 0;
        for(int i = 0; i < textToChars.length; i++){
            if(textToChars[i] == 'o' || textToChars[i] == 'a' || textToChars[i] == 'e' || textToChars[i] == 'i' || textToChars[i] == 'u' || textToChars[i] == 'y'){
                count++;
            }
        }
        return count;
    }
}
