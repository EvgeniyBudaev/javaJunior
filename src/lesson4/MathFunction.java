package lesson4;

public class MathFunction {


    // модификатор доступа (4 вида)
    // статичность static - принадлежность классу. Если пусто, то принаджлежность объекту.
    // возвращаемый тип: void если ничего не возвращает или int - если ждем возвращение целого числа.
    // Название метода с маленькой буквой всегда (придумываем)
    public static int summaTrehChisel(int a, int b, int c) { // (входящие параметры)
        int summa = a + b + c;
        return (summa); // возвращаем
    }

    //банковский вклад
    public static double summaVklada (double vklad, int procent, int year) { // double summaVklada (double vklad, int procent, int year) это сигнатура метода. Сленг.
        for (int i = 0; i < 7; i++) {
            vklad = vklad + (vklad/100*procent); // Тут int преобразовывается в double

        }
        return (vklad);
    }

    // найти площадь треугольника
    public static double ploshadtreygolnika (int a, int b, int c) {
        int p = (a + b +c) / 2;
        int podKornem = p* (p - a) * ( p - b) * (p - c);
        double s = Math.sqrt(podKornem);
        return (s);
    }



}
