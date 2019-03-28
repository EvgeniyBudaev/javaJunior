package lesson9.homework9;

public class Man {
    private String name;
    private String sername;
    private int age;
    private String address;

    public Man() { //Бездомный мужчина

    }

    public Man(String nameM, String sernameM, int ageM, String addressM) { //Регистрация мужчин
        name = nameM;
        sername = sernameM;
        age = ageM;
        address = addressM;
    }

    public Man(String nameM, String sernameM, int ageM) { //Мужчина без прописки
        name = nameM;
        sername = sernameM;
        age = ageM;
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
}
