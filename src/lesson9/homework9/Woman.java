package lesson9.homework9;

public class Woman {
    private String name;
    private String sername;
    private int age;
    private String address;

    public Woman() { //Бездомная женщина

    }

    public Woman(String nameW, String sernameW, int ageW, String addressW) { //Регистрация женщин
        name = nameW;
        sername = sernameW;
        age = ageW;
        address = addressW;
    }

    public Woman(String nameW, String sernameW, int ageW) { //Женщина без прописки без прописки
        name = nameW;
        sername = sernameW;
        age = ageW;
    }

    public String getName() {
        return name;
    }

    public String getSername() {
        return sername;
    }

    public int getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }

    public void setName(String n) {
        name = n;
    }

    public void setSername(String ser) {
        sername = ser;
    }

    public void setAge(int ag) {
        age = ag;
    }

    public void setAddress(String addr) {
        address = addr;
    }

    public void print() {
        System.out.printf("Имя - %s, Фамилия - %s, Возраст - %s, Страна - %s", name, sername, age, address);
        System.out.println();
    }
}
