package lesson12.domashka;

public class Main {
    public static void main(String[] args) {

        FractionNumberOperation<Integer> addition = ((a, b) -> a + b);
        System.out.println(addition.add(8, 4));

        FractionNumberOperation<Integer> subtraction = ((a, b) -> a - b);
        System.out.println(subtraction.add(8,4));

        FractionNumberOperation<Integer> multiplication = ((a, b) -> a * b);
        System.out.println(multiplication.add(8,4));

        FractionNumberOperation<Integer> division = ((a, b) -> a / b);
        System.out.println(division.add(8,4));


    }
}
