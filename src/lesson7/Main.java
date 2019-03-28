package lesson7;

public class Main {
    public static void main(String[] args) {
        String text = "Text qwety are you";
       String newText = text.replace(" ", "-");
       newText = newText.replace("e", "E");
       // text = text + " что-то дописали";
//        for (int i = 0; i < 10; i++){
//            text = text + ", " + i;
//        }
       System.out.println(text);
        System.out.println(newText);

        char charAt2 = text.charAt(2);
        System.out.println(charAt2);

        char[] charsFromText = text.toCharArray();
    }
}
