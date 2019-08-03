package lesson23; // Полиморфизм

public class Main {
    public interface Shape {
        void draw();
        void erase();
    }
    public static class Circle implements Shape {
        public void draw() {
            System.out.println("Circle.draw()");
        }

        @Override
        public void erase() {

        }
    }
    public static class Triangle implements Shape {
        public void draw() {
            System.out.println("Triangle.draw()");
        }

        @Override
        public void erase() {

        }
    }

    public static class TestPol {

        public static void main(String[] args) {
            Shape shape1 = new Circle();
            Shape shape2 = new Triangle();
            testPoly(shape1);
            testPoly(shape2);
        }

        public static void testPoly(Shape shape) {
            shape.draw();
        }
    }
}
