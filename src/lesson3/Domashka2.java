package lesson3;

public class Domashka2 { // Сколько денег нам вернет банк, если мы положим 10тыс на 7 лет под 9% годовых.
    public static void main(String[] args) {

        double money = 10000;
        double rate = 0.09;
        for (double i = 1; i < 8; i++) {
            money = money + money * rate;

        }
        System.out.println("Ваша сумма накоплений за 7 лет составляет: " + money);
    }
}
