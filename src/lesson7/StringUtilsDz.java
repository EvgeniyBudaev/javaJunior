package lesson7;

import java.util.Arrays;

public class StringUtilsDz {

    //1.Написать метод public static int countSoglasnie(String text). Метот должен посчитать согласные в тексте, и
    // вернуть результат в виде числа.
    public static int countSoglasnie(String text) {
        char[] textToChars = text.toCharArray();
        int count = 0;
        for (int i = 0; i < textToChars.length; i++) {
            if (textToChars[i] == 'b' || textToChars[i] == 'c' || textToChars[i] == 'd' || textToChars[i] == 'f' || textToChars[i] == 'g'
                    || textToChars[i] == 'h' || textToChars[i] == 'j' || textToChars[i] == 'k' || textToChars[i] == 'l'
                    || textToChars[i] == 'm' || textToChars[i] == 'n' || textToChars[i] == 'p' || textToChars[i] == 'q'
                    || textToChars[i] == 'r' || textToChars[i] == 's' || textToChars[i] == 't' || textToChars[i] == 'v'
                    || textToChars[i] == 'w' || textToChars[i] == 'x' || textToChars[i] == 'z') {
                count++;
            }
        }
        return count;
    }

    //2. Напиисать метод public static String reverse(String text).
    // Метод должен возвращать перевернутую с обратной стороны строку text.
    public static String reverse(String text) {
        char[] strokaToChars = text.toCharArray();
        String resultString = "";
        for (int i = strokaToChars.length - 1; i >= 0; i--) {
            resultString += strokaToChars[i];
        }
        return resultString;
    }

    // 3. Написать метод public static String deleteZnakiPrepinania(String text).
    // Метод должен вернуть текст без всех знаков препинания.
    public static String deleteZnakiPrepinania(String text) {
        String bezZnakov = text.replaceAll("[,!.:;-]", "");
        return bezZnakov;
    }
}
