package lesson1;

public class Main14 { // Метод вычисляет минимум из 4-х чисел
    public static int min(int a, int b, int c, int d) { // Метод min(a, b, c, d) использует метод min(a, b)
        //напишите тут ваш код
        int x = min (a, b);
        int y = min (c, d);
        if (x < y)
            return x;
        else return y;

    }

    public static int min(int a, int b) {
        //напишите тут ваш код
        if (a < b)
            return a;
        else
            return b;

    }

    public static void main(String[] args) throws Exception {
        System.out.println(min(-20, -10));
        System.out.println(min(-40, -10, -30, 40));
        System.out.println(min(-20, -40, -30, 40));
        System.out.println(min(-20, -10, -40, 40));
        System.out.println(min(-20, -10, -30, -40));
    }
}
