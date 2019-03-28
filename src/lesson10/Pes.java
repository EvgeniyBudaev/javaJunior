package lesson10;

public class Pes extends Animal{

    public Pes(){

    }
    public Pes(String name, int age, int price){
        super(name, age, price);
    }

    public void print(){
        System.out.printf("Пес: Кличка - %s, возраст - %d, цена - %d", this.getName(), this.getAge(), this.getPrice());
        System.out.println();
    }
}
