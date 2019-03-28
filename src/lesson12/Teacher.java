package lesson12;

public class Teacher implements Rabotnik {
    @Override
    public void getSallary() {
        System.out.println("Я учитель, и получаю 20тыс.руб.");
    }

    @Override
    public void doWork() {
        System.out.println("Я учитель, и учу людей");

    }
}
