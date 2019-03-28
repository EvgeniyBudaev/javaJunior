package lesson1;

public class Main12 { // Метод вычисляет минимум из 2-х чисел
    public static int min(int a, int b) {
        int Exception;
        if (a < b)
            Exception = a;
        else Exception = b;
        return Exception;
    }

    public static void main(String[] args) throws Exception {
        System.out.println(min(12, 33));
        System.out.println(min(-20, 0));
        System.out.println(min(-10, -20));
    }
}