package lesson12;

import java.util.Objects;

//implements - следует шаблону
public class Shofer implements Father, Rabotnik {
    private int age;
    private String name;

    public Shofer(){

    }

    public Shofer(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public void otveztiRebenkaVDetsad() {
        System.out.println("Я шофер и я отвожу ребенка на служебной машине");
    }

    @Override
    public void zabratRebenkaSSada() {
        System.out.println("Я шофер и я забираю ребенка на служебной машине");
    }

    @Override
    public void getSallary() {
        System.out.println("Я шофер и я получаю 100 000руб.");
    }

    @Override //анотация говорит, что мы переопределили метод
    public void doWork() {
        System.out.println("Я шофер, и я еду");
    }

    //переопределение Generate -> equals and hashCode - > next next

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Shofer shofer = (Shofer) o;
        return age == shofer.age &&
                Objects.equals(name, shofer.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(age, name);
    }

    @Override
    public String toString() {
        return "Shofer{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
