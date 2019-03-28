package lesson12.reshenie;

public class Main {
    public static void main(String[] args) {
        FractionNumberImpl drob1 = new FractionNumberImpl(1, 4);
        FractionNumberImpl drob2 = new FractionNumberImpl(2, 7);

        FractionNumberOperationImpl operation = new FractionNumberOperationImpl();
        operation.add(drob1, drob2);
        FractionNumber result = operation.add(drob1, drob2);
    }

}
