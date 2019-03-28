package lesson12.lambdi2;

public class Main {
    public static void main(String[] args) {
        Operation<Integer> add = ((num1, num2) -> num1 + num2);
        System.out.println(add.getResult(8, 4));
    }
}
