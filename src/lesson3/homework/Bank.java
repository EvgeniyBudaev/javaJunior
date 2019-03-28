package lesson3.homework;

public class Bank { // Сколько денег нам вернет банк, если мы положим 10тыс на 7 лет под 9% годовых.
    public static void main(String[] args) {
        double vklad = 10000;
        double procent = 9;
        double year = 7;
        for (int i = 0; i < 7; i++) {
            vklad = vklad + (vklad/100*procent);
        }
        System.out.println(vklad);
    }
}
