package lesson10.homework;

public class Form1 {
    private int storona1;
    private int storona2;
    private int storona3;

    public Form1() {

    }

    public Form1(int storona1) {
        this.storona1 = storona1;
    }

    public Form1(int storona1, int storona2) {
        this.storona1 = storona1;
        this.storona2 = storona2;
    }

    public Form1(int storona1, int storona2, int storona3) {
        this.storona1 = storona1;
        this.storona2 = storona2;
        this.storona3 = storona3;
    }

    public int getStorona1() {
        return storona1;
    }

    public int getStorona2() {
        return storona2;
    }

    public int getStorona3() {
        return storona3;
    }


    public void setStorona1(int storona1) {
        this.storona1 = storona1;
    }

    public void setStorona2(int storona2) {
        this.storona2 = storona2;
    }

    public void setStorona3(int storona3) {
        this.storona3 = storona3;
    }

    public void print() {

    }
}
