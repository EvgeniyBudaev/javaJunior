package lesson1;

public class Main13 { // Метод вычисляет минимум из 3-х чисел
    public static int min(int a, int b, int c) {
        int Exception;
        if (a <= b && a <= c)
            Exception = a;
        else if (b <= a && b <= c)
            Exception = b;
        else
            Exception = c;
        return Exception;

    }

    public static void main(String[] args) throws Exception {
        System.out.println(min(1, 2, 3));
        System.out.println(min(-1, -2, -3));
        System.out.println(min(3, 5, 3));
        System.out.println(min(5, 5, 10));
    }

}
