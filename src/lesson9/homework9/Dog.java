package lesson9.homework9;

public class Dog {
    private String name;
    private int age;
    private boolean lai;

    public Dog() { //Неизвестный уличный пёс

    }

    public Dog(String nameD, int ageD) { //Молчаливая собака
        name = nameD;
        age = ageD;
    }

    public Dog(String nameD, boolean laiD) { //Собака без определенного возраста
        name = nameD;
        lai = laiD;
    }

    public Dog(String nameD, int ageD, boolean laiD) { //Домашняя собака
        name = nameD;
        age = ageD;
        lai = laiD;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public boolean getLai() {
        return lai;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setLai() {
        this.lai = lai;
    }

    public void print() {
        System.out.println("Имя собаки: " + getName() + " ,возраст:" + getAge() + " лет ,наличие лая: " + getLai());
    }
}
