package lesson10;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal("Зебра", 5, 1000);
        Lion lion = new Lion("Lion",3 , 500);
        //        lion.setName("Lion");
        //        lion.setAge(13);
        //        lion.setPrice(10000);

        lion.print();
        animal.print();

        Lion lion1 = new Lion("Лев1", 2, 500);
        Lion lion2 = new Lion("Лев2", 3, 700);
        Lion lion3 = new Lion("Лев3", 4, 800);

        Pes pes1 = new Pes("Pes1", 5, 1200);
        Pes pes2 = new Pes("Pes2", 7, 20000);
        Pes pes3 = new Pes("Pes3", 10, 30000);

        Animal[] zoo = new Animal[6];
        zoo[0] = pes1;
        zoo[1] = lion2;
        zoo[2] = lion1;
        zoo[3] = pes2;
        zoo[4] = lion3;
        zoo[5] = pes3;



        for(int i = 0; i < zoo.length; i++){
            zoo[i].print();
        }

    }
}
