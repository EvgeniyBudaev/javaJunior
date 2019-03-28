package lesson1;

public class Main4 {
    public static void main(String[] args) {
        int a = 5, b = 7, c = 10; // стороны треугольника
        int p = (a + b +c) / 2; // полупериметр треугольника
        int podKornem = p* (p - a) * ( p - b) * (p - c); // Площадь треугольника по формуле Герона S=√p(p−a)(p−b)(p−c).

        double s = Math.sqrt(podKornem); // Вычисление площади треугольника по формуле

        System.out.println(" Площадь треугольника равна: " + s);
    }
}
