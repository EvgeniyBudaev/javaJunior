package lesson9.homework9;

public class Car {
    private String model;
    private int maxspeed;

    public Car() {

    }

    public Car(String model, int maxspeed) {
        this.model = model;
        this.maxspeed = maxspeed;
    }

    public Car(String model) {
        this.model = model;
    }

    public Car(int maxspeed) {
        this.maxspeed = maxspeed;
    }

    public String getModel() {
        return model;
    }

    public int getMaxspeed() {
        return maxspeed;
    }

    public void setModel(String mod) {
        model = mod;
    }

    public void setMaxspeed(int max) {
        maxspeed = max;
    }

    public void print() {
        System.out.println();
        System.out.println("Модель: " + getModel());
        System.out.println("Максимальная скорость: " + getMaxspeed());
    }
}
