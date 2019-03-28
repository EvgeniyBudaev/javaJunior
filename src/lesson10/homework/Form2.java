package lesson10.homework;

public class Form2 {
    private int radius;
    private int radius2;

    public Form2() {

    }

    public Form2(int radius) {
        this.radius = radius;
    }

    public Form2(int radius, int radius2) {
        this.radius = radius;
        this.radius2 = radius2;
    }

    public int getRadius() {
        return radius;
    }

    public int getRadius2() {
        return radius2;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public void setRadius2(int radius2) {
        this.radius2 = radius2;
    }
}
