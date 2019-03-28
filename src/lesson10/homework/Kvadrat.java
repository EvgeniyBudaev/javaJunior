package lesson10.homework;

public class Kvadrat extends Form1 {

    public Kvadrat() {
    }

    public Kvadrat(int storona1) {
        super(storona1);
    }

    public void print() {
        System.out.printf("Квадрат: сторона1 - %d", this.getStorona1());
        System.out.println();
    }

}
