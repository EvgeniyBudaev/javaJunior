package lesson1;

public class Main8 { // Конвертер из градусов Цельсия в градусы Фаренгейт
    public static void main(String[] args) {
        System.out.println(convertCelsiumToFahrenheit(41));
    }

    public static double convertCelsiumToFahrenheit(int celsium) {
        double fahrenheit = (celsium * 1.8) + 32;//напишите тут ваш код


        return fahrenheit;
    }
}