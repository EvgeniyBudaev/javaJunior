package lesson12.domashka12;

public class Main {
    public static void main(String... arguments) {
        FractionNumberOperation fractionNumberOperation = new FractionNumberOperation() {
            @Override
            public Object add(Object a, Object b) throws NullPointerException {

                return null;
            }

            @Override
            public int add(int a, int b) {

                return a + b;
            }

            @Override
            public Object sub(Object a, Object b) throws NullPointerException {

                return null;
            }

            @Override
            public int sub(int a, int b) {

                return a - b;
            }

            @Override
            public Object mul(Object a, Object b) throws NullPointerException {

                return null;
            }

            @Override
            public int mul(int a, int b) {

                return a * b;
            }

            @Override
            public Object div(Object a, Object b) throws NullPointerException, ArithmeticException {

                return null;
            }

            @Override
            public int div(int a, int b) {

                return a / b;
            }
        };
        System.out.println(fractionNumberOperation.add(8, 4));
        System.out.println(fractionNumberOperation.sub(8, 4));
        System.out.println(fractionNumberOperation.mul(8, 4));
        System.out.println(fractionNumberOperation.div(8, 4));

        FractionNumber fractionNumber = new FractionNumber(){
            private double dividend;
            private double divisor;

            public String toString(int dividend) {
                return null;
            }

            @Override
            public void setDividend(int dividend) {
                this.dividend = dividend;
            }

            @Override
            public double getDividend() {
                return dividend;
            }

            @Override
            public void setDivisor(int divisor) throws IllegalArgumentException {
                this.divisor = divisor;

            }

            @Override
            public double getDivisor() {
                return divisor;
            }


            @Override
            public String value() {
                return String.valueOf(0);
            }

            @Override
            public String toString() {
                return "$classname{" +
                        "dividend=" + dividend +
                        ", divisor=" + divisor +
                        '}';
            }
        };
        fractionNumber.setDividend(1);
        fractionNumber.setDivisor(4);
        System.out.println();
        System.out.println(fractionNumber.getDividend() / fractionNumber.getDivisor());
        System.out.println();
        System.out.println(Integer.toString(1) + "/" + Integer.toString(4));
    }
}

