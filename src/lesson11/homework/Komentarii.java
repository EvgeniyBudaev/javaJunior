package lesson11.homework;

public class Komentarii { //Вкладка "Комментарии"
    private String name;
    private String email;
    private String city;
    private String textKomentariya;

    public Komentarii(){

    }

    public Komentarii(String name, String email, String city, String textKomentariya) {
        this.name = name;
        this.email = email;
        this.city = city;
        this.textKomentariya = textKomentariya;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getTextKomentariya() {
        return textKomentariya;
    }

    public void setTextKomentariya(String textKomentariya) {
        this.textKomentariya = textKomentariya;
    }
}
