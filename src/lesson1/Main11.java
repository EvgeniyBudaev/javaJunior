package lesson1;

public class Main11 { // Конвертер веза Земли в вес Луны
    public static void main(String[] args) {
        System.out.println(getWeight(888));
    }

    public static double getWeight(int earthWeight) {
        double moonWeight = earthWeight * 0.17;
        return moonWeight;
    }
}

