package lesson10;

public class Lion extends Animal {

    public Lion(String name, int age, int price){
//        this.setName(name);
//        this.setAge(age);
//        this.setPrice(price); или
        super(name, age, price);

    }

    @Override //Анотация.
    public void print() {
        //super.print(); Удаляем эту строку и можем писать свою логику
        System.out.printf("Лев: Кличка - %s, возраст - %d, цена - %d", this.getName(), this.getAge(), this.getPrice());
        System.out.println();
    }
    public void voice(){
        System.out.println("PPppp");
    }
}
