package lesson9.homework9;

public class Main {
    public static void main(String[] args) {
        Man man = new Man();
        Woman woman = new Woman("Anna", "Karenina", 20, "Россия");
        Cat cat = new Cat();
        Dog laika = new Dog("Черныш", 5, true);
        Car toyota = new Car("Camry", 220);

        man.setName("Nikola");
        man.setSername("Tesla");
        man.setAge(30);
        man.setAddress("USA");
        System.out.println(man.getName());
        System.out.println(man.getSername());
        System.out.println(man.getAge());
        System.out.println(man.getAddress());
        System.out.println();

        woman.print();

        cat.setName("Мурзик");
        cat.setAge(1);
        cat.setTail("Есть хвост");
        System.out.println();
        System.out.println("Имя кота: " + cat.getName() + " ,лет: " + cat.getAge() + " , " + cat.getTail());
        System.out.println();

        laika.print();

        toyota.print();
    }
}
