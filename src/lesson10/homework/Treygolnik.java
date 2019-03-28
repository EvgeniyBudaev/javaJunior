package lesson10.homework;

public class Treygolnik extends Form1 {
    public Treygolnik() {
    }

    public Treygolnik(int storona1, int storona2, int storona3) {
        super(storona1, storona2, storona3);
    }

    public void print() {
        System.out.printf("Треугольник: сторона1 - %d, сторона2 - %d, сторона3 - %d", this.getStorona1(), this.getStorona2(), this.getStorona3());
        System.out.println();
        System.out.println();
    }
}
