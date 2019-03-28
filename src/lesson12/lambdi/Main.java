package lesson12.lambdi;

public class Main {
    //public static void main(String[] args) {
      public static void main(String... arguments) {

          Operation operation = new Operation() {
              @Override
              public double getResult(double num1, double num2) {

                  return num1 + num2;
              }
          };
          System.out.println(operation.getResult(8.0, 4.0));

          Operation lambda = ((num1, num2) -> num1 + num2);
          System.out.println(lambda.getResult(8.0, 4.0));
      }
}
