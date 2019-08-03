package lesson18.balance;

import InsufficientFundsException.InsufficientFundsException;

public class Bank {
    public static void main(String[] args) {
        Checking checking = new Checking(101);
        System.out.println("Депозит $300...");
        checking.deposit(300.00);

        try {
            System.out.println("\nСнятие $100...");
            checking.withdraw(100);
            System.out.println("\nСнятие $400...");
            checking.withdraw(400);
        } catch (InsufficientFundsException e) {
            System.out.println("Извините, но у Вас $" + e.getAmount());
            e.printStackTrace();
        }
    }
}
