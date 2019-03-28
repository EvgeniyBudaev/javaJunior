package lesson1;

public class Main5 { //Проверяем стороны треугольника
    public static void main(String[] args) {
        int a = 5, b = 2, c = 5;

        if(a == b && b == c && a == c) {
            System.out.println("Треугольник равносторонний");
        }
        if(a == b || b == c || a == c) {
            System.out.println("Треугольник равнобедренный");
        }
        if(a != b && b != c && a != c) {
            System.out.println("Треугольник разносторонний");
        }
    }
}