package lesson10.homework;

public class Main {
    public static void main(String[] args) {

        Kvadrat kvadrat = new Kvadrat(10);
        Pryamoygolnik pryamoygolnik = new Pryamoygolnik(5, 4);
        Treygolnik treygolnik = new Treygolnik(1, 2, 3);

        Oval oval = new Oval(7, 8);
        Krug krug = new Krug(12);

        kvadrat.print();
        pryamoygolnik.print();
        treygolnik.print();

        krug.print();
        oval.print();
    }
}
