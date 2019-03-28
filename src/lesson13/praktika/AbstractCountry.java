package lesson13.praktika;

public abstract class AbstractCountry implements Country{ //нельзя в мейне создать объект AbstractCountry country = new AbstractCountry();
                                                          //могут быть методы без реализации
    private int naselenie;
    private int kolichestvoKurortov;
    private int ploshad;
    private String stolica;
    private boolean visa;

    public int getNaselenie() {
        return naselenie;
    }

    public void setNaselenie(int naselenie) {
        this.naselenie = naselenie;
    }

    public int getKolichestvoKurortov(int i) {
        return kolichestvoKurortov;
    }

    public void setKolichestvoKurortov(int kolichestvoKurortov) {
        this.kolichestvoKurortov = kolichestvoKurortov;
    }

    public int getPloshad() {
        return ploshad;
    }

    public void setPloshad(int ploshad) {
        this.ploshad = ploshad;
    }

    public void setStolica(String stolica) {
        this.stolica = stolica;
    }

    public boolean isVisa() {
        return visa;
    }

    public void setVisa(boolean visa) {
        this.visa = visa;
    }

    @Override
    public void printNaselenie() {
        System.out.println(naselenie);
    }

    @Override
    public void printKolichestvoKurortov() {
        System.out.println(kolichestvoKurortov);

    }

    @Override
    public void printPloshad() {
        System.out.println(ploshad);

    }

    @Override
    public String getStolica() {
        return stolica;
    }

    @Override
    public boolean needVisa() {
        return visa;
    }

//    @Override
//    public void printCountryName() {
//
//    }
}
