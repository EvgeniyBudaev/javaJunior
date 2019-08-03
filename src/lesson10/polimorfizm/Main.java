package lesson10.polimorfizm;

public class Main {
    public static void main(String[] args) {
        Birds ytka = new Ytka();
        Birds vorobei = new Vorobei();
        //первый способ
        Test test = new Test();
        test.foo(ytka);
        test.foo(vorobei);

        System.out.println();
     //второй способ
     Birds[] birds = new Birds[2];
        birds[0] = ytka;
        birds[1] = vorobei;

        for (int i=0; i < birds.length; i++) {
            birds[i].voice();
        }
    }
}
