package interview.task;

public class StringUtils {
    private String str;

    public StringUtils() {
    }

    public StringUtils(String str) {
        this.str = str;
    }

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }

    public TextBuffer method(String str){
        TextBuffer textBuffer = new TextBuffer();
        char[] chars = str.toCharArray();
        int sum=0;
        int [] indexOfRusChars = new int[1200];
        for(int i = 0; i < chars.length; i++) {
            indexOfRusChars[chars[i]]++;
        }
        for (int i = 1000; i < indexOfRusChars.length; i++) {
            if (indexOfRusChars[i] != 0)
                System.out.println((char)i + " " + indexOfRusChars[i] + " раз");
        }
return textBuffer;
    }
}
