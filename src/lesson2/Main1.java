package lesson2;

public class Main1 {
    public static void main(String[] args) {
        int a = 7;
        int b = 4;
        int c = 5;

        if (a == b && b == c && c == a) {
            System.out.println("Это равносторонний треугольник");
        } else {
            System.out.println("Это раpносторонний  или равнобедренный треугольник");
        }

        if ( a != b && b != c && c != a) {
            System.out.println("Это разносторонний треугольник");
        }
        if ((a == b && c != a) || (b == c && b != a)) {
            System.out.println("Это равнобедренный треугольник!");
        }
    }
}
