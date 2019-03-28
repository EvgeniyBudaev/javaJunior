package lesson10.homework;

public class Krug extends Form2 {
    public Krug() {

    }

    public Krug(int radius) {
        super(radius);
    }

    public void print() {
        System.out.printf("Круг: радиус - %d", this.getRadius());
        System.out.println();
    }
}
