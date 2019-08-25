package Podgotovka.Kontatenaciya;

public class Main {
    public static void main(String[] args) {
        String name = "text";
        int a = 5;
        int b = 1;
        int c = 2;
        int d = 4;

        System.out.println(name + a + b); //text51
        System.out.println(a + b + name); //6text
        System.out.println(name + a + b + (c + d)); //text516
    }
}
