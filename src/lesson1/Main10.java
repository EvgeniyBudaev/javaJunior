package lesson1;

public class Main10 { // Женщина влдаеет домашними животными
    public static void main(String[] args) {

        Cat cat = new Cat();
        Dog dog = new Dog();
        Fish fish = new Fish();
        Woman woman = new Woman();
        cat.owner = woman;
        dog.owner = woman;
        fish.owner = woman;
        System.out.println(cat +" " + dog + " " + fish + " " + woman);
    }

    public static class Cat {
        public Woman owner;
    }

    public static class Dog {
        public Woman owner;
    }

    public static class Fish {
        public Woman owner;
    }

    public static class Woman {
    }
}


