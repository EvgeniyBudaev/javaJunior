package lesson21.homework;

public class Main {

    public static void main(String[] args) {
        Thread man1 = new Thread(new Man1());
        man1.start();
        Printer printer = new Printer();
        printer.setDaemon(true);
        printer.start();
    }
}
