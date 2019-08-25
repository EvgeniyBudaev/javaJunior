package Podgotovka.Collections;

import java.util.Objects;

public class Car implements Comparable<Car>{
    private String name;
    private int year;
    private String color;

    public Car() {
    }

    public Car(String name, int year, String color) {
        this.name = name;
        this.year = year;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }


    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", year=" + year +
                ", color='" + color + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return year == car.year &&
                Objects.equals(name, car.name) &&
                Objects.equals(color, car.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, year, color);
    }

    @Override
    public int compareTo(Car o) {
        if(this.name != o.name){
            return this.name.compareTo(o.name);
        }

        if(this.year != o.year){
            return this.year - o.year;
        }

        return this.color.compareTo(o.color);
    }
}
