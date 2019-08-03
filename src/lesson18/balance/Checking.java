package lesson18.balance;

import InsufficientFundsException.InsufficientFundsException;

public class Checking {
    private int number;
    private double balance;

    //конструктор
    public Checking(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount){ //deposit - это вклад
        balance += amount; //баланс

    }

    public void withdraw(double amount) throws InsufficientFundsException { //метод снятия денег
        if(amount <= balance){
            balance -= amount;
        }else{
            double needs = amount - balance;
            throw new InsufficientFundsException(needs);
        }
    }

}
