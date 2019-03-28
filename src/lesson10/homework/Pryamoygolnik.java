package lesson10.homework;

public class Pryamoygolnik extends Form1 {

    public Pryamoygolnik() {
    }

    public Pryamoygolnik(int storona1, int storona2) {
        super(storona1, storona2);
    }

    public void print() {
        System.out.printf("Прямоугольник: сторона1 - %d, сторона2 - %d", this.getStorona1(), this.getStorona2());
        System.out.println();
    }
}
