package lesson9;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        Student vasya = new Student();
        Student petya = new Student();
        double result = vasya.perimetr(2, 7 , 4);

        //vasya.name = "Vasya"; //не очень хорошо выглядит такое написание кода
        vasya.setName("Vasya");
        petya.setName("Petya");

        vasya.setAge(30);
        petya.setAge(20);

        vasya.setSername("Yablokov");
        petya.setSername("Pypkin");

        System.out.println(petya.getName());
        System.out.println(vasya.getName());
    }
}
