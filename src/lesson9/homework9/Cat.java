package lesson9.homework9;

public class Cat {
    private String name;
    private int age;
    private String tail; //tail - хвост

    public Cat() { //Для уличных котов

    }

    public Cat(String nameC, int ageC) { //Для домашних котов
        name = nameC;
        age = ageC;
    }

    public Cat(String nameC, int ageC, String tail) { //Кошки с пушистыми хвостами :)
        name = nameC;
        age = ageC;
        this.tail = tail;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getTail() {
        return tail;
    }

    public void setName(String nam) {
        name = nam;
    }

    public void setAge(int ag) {
        age = ag;
    }

    public void setTail(String tail) {
        this.tail = tail;
    }
}
