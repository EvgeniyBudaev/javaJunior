package interview.task;


public class Main {

    public static void main(String[] args) {
        StringUtils stringUtils = new StringUtils();
        TextBuffer res = stringUtils.method("ааАбв");
        System.out.println(res);
//        String str = "аааААббвг";
//        str = str.toLowerCase(); можно все символы привести к нижнему регистру
//        char[] chars = str.toCharArray();
//        int sum=0;
//        int [] indexOfRusChars = new int[1200];
//        for(int i = 0; i < chars.length; i++) {
//            indexOfRusChars[chars[i]]++;
//        }
//        for (int i = 1000; i < indexOfRusChars.length; i++) {
//            if (indexOfRusChars[i] != 0)
//                System.out.println((char)i + " " + indexOfRusChars[i] + " раз");
//        }


    }
}
