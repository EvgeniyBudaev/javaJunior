package lesson10.homework;

public class Oval extends Form2 {
    public Oval() {
    }

    public Oval(int radius, int radius2) {
        super(radius, radius2);
    }

    public void print() {
        System.out.printf("Овал: радиус - %d, радиус2 - %d", this.getRadius(), this.getRadius2());
        System.out.println();
    }
}
