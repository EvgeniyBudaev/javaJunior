package lesson9;

public class Student {
    private int age = 0;
    private String name = null;
    private String sername = null;

    public double perimetr(int a, int b , int c){
        return a + b +c;
    }

    public void setName(String n){ //Setter - присваиваем значение
        name = n;
    }
    public void setAge(int a){
        age = a;
    }
    public void setSername(String sername){
        sername = sername;
    }

    public String getName(){ //Getter - возвращаем значение
        return name;
    }
}
