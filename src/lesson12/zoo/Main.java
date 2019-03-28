package lesson12.zoo;

public class Main {
    public static void main(String[] args) {
        ZooAnimal[] animals = new ZooAnimal[6];
        animals[0] = new Monkey();
        animals[1] = new Monkey();
        animals[2] = new Lion();
        animals[3] = new Monkey();
        animals[4] = new Lion();
        animals[5] = new Monkey();

        for(int i = 0; i < animals.length; i++){ //полиморфизм
            animals[i].jump();
        }
    }
}
