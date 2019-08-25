package Podgotovka;

public class Hashcode {
    public static void main(String[] args) {
        //хеш-код — это целочисленный результат работы метода, которому в качестве входного параметра передан объект.
        Object object = new Object();
        int hCode;
        hCode = object.hashCode();
        System.out.println(hCode);

        /*
        Если хеш-коды разные, то и входные объекты гарантированно разные.
        Если хеш-коды равны, то входные объекты не всегда равны.*/

     //Ситуация, когда у разных объектов одинаковые хеш-коды называется — коллизией.
    }
}
