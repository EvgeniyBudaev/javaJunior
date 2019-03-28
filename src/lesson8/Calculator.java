package lesson8;

import java.util.Scanner;

public class Calculator {
    // Консольный калькулятор.
    // Метод int getInt() должен считывать с консоли целое число и возвращать его.
    // Метод char getOperation() должен считывать с консоли какое-то значение и возвращать символ с операцией (+, -, *, /).
    // Метод int calc(int num1, int num2, char operation) - должен выполнять арифметическию операцию, заданную operation.
    // Метод main() - должен считывать 2 числа (с помощью getIn()), считать операцию (с помощью getOperation(), передать
    // всё методу calc() и вывести на экран результат.
    public static void main(String[] args) throws Exception {
        System.out.println("Введите первое целое число: ");
        int num1 = getInt();
        System.out.println("Введите знак операции + - * / ");
        char operation = getOperation();
        System.out.println("Введите второе целое число: ");
        int num2 = getInt();
        System.out.println("Результат равен: ");
        int resultat = calc(num1, num2, operation);
        System.out.println(resultat);
    }

    public static int getInt() {
        Scanner sc = new Scanner(System.in);
        String inputNumber = sc.nextLine();
        int number = Integer.parseInt(inputNumber);
        return (number);
    }

    public static char getOperation() {
        Scanner sc = new Scanner(System.in);
        char symbol = sc.next().charAt(0);
        return symbol;
    }

    public static int calc(int num1, int num2, char operation) {
        int resultat;
        switch (operation) {
            case '+':
                resultat = num1 + num2;
                break;
            case '-':
                resultat = num1 - num2;
                break;
            case '*':
                resultat = num1 * num2;
                break;
            case '/':
                resultat = num1 / num2;
                break;
            default:
                resultat = calc(num1, num2, getOperation());
        }
        return (resultat);
    }
}
