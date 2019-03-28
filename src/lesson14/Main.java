package lesson14;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> texts = new ArrayList<>();
        texts.add("qwerty");
        texts.add("tite");
        texts.add("pom");

        texts.add(0, "!!!!!!");
        texts.set(0, "++++");
        texts.remove(2);
        System.out.println(texts);
    }
}
