package lesson12.domashka12;

/**
 * Интерфейс операций с числами FractionNumber. Для вывода ошибок функции могут бросать ArithmeticException
 *
 * @author nedis
 * @version 1.0
 */

public interface FractionNumberOperation<FractionNumber> {

    /**
     * Сложение двух чисел FractionNumber
     *
     * @param a первое слагаемое
     * @param b второе слагаемое
     * @return результат в виде числа FractionNumber
     * @throws NullPointerException если а или b равны null
     */

    FractionNumber add (FractionNumber a, FractionNumber b) throws NullPointerException;

    int add(int a, int b);

    /**
     * Вычитание двух чисел FractionNumber
     *
     * @param a уменьшаемое
     * @param b вычитаемое
     * @return результат в виде числа FractionNumber
     * @throws NullPointerException если а или b равны null
     */

    FractionNumber sub (FractionNumber a, FractionNumber b) throws NullPointerException;

    int sub(int a, int b);

    /**
     * Умножение двух чисел FractionNumber
     *
     * @param a первый множитель
     * @param b второй множитель
     * @return результат в виде числа FractionNumber
     * @throws NullPointerException если а или b равны null
     */

    FractionNumber mul (FractionNumber a, FractionNumber b) throws NullPointerException;

    int mul(int a, int b);

    /**
     * Деление двух чисел FractionNumber
     *
     * @param a делимое
     * @param b делитель
     * @return результат в виде числа FractionNumber
     * @throws NullPointerException если а или b равны null
     * @throws ArithmeticException в случае если происходит деление на 0
     */

    FractionNumber div (FractionNumber a, FractionNumber b) throws NullPointerException, ArithmeticException;

    int div(int a, int b);
}
