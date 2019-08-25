package Podgotovka.Sravnenie;

public class Main {
    public static void main(String[] args){
        Car car1 = new Car();
        car1.setName("LADA");

        Car car2 = new Car();
        car2.setName("LADA");

        String text1 = "LADA";
        String text2 = "LADA";

        String text3 = new String("LADA");

        System.out.println(car1.equals(car2)); //true, если переопределить метод equals в классе Car

        System.out.println(text1.equals(car1)); //false в любом случае, даже если  переопределить метод equals в классе Car

        System.out.println(text1 == text2); //true
        System.out.println(text1.equals(text2)); //true

        System.out.println(text1 == text3);  //false
        System.out.println(text1 == text3.intern()); //true

    }
}
