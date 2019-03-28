package lesson11.homework;
import java.util.ArrayList;
public class Goods { // Товары в dns
    private String productName;
    private int price;
    private double valuationOfGoods; // оценка товара по количеству звезд
    private int guarantee; // Срок гарантии на товар
    private String producingCountry; // Страна-производитель
    private int productCode; //Код товара
    private Photo[] photos = new Photo[10];
    private Otzivi[] otzivi = new Otzivi[100];
    private ArrayList <Komentarii> koment = new ArrayList<>(); //будет создано комментариев столько колько нужно

    public Goods(){

    }

    public Goods(String productName, int price, double valuationOfGoods, int guarantee, String producingCountry, int productCode) {
        this.productName = productName;
        this.price = price;
        this.valuationOfGoods = valuationOfGoods;
        this.guarantee = guarantee;
        this.producingCountry = producingCountry;
        this.productCode = productCode;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public double getValuationOfGoods() {
        return valuationOfGoods;
    }

    public void setValuationOfGoods(double valuationOfGoods) {
        this.valuationOfGoods = valuationOfGoods;
    }

    public int getGuarantee() {
        return guarantee;
    }

    public void setGuarantee(int guarantee) {
        this.guarantee = guarantee;
    }

    public String getProducingCountry() {
        return producingCountry;
    }

    public void setProducingCountry(String producingCountry) {
        this.producingCountry = producingCountry;
    }

    public Photo[] getPhotos() {
        return photos;
    }

    public void setPhotos(Photo[] photos) {
        this.photos = photos;
    }

    public int getProductCode() {
        return productCode;
    }

    public void setProductCode(int productCode) {
        this.productCode = productCode;
    }

    public Otzivi[] getOtzivi() {
        return otzivi;
    }

    public void setOtzivi(Otzivi[] otzivi) {
        this.otzivi = otzivi;
    }

    public ArrayList getKoment() {
        return koment;
    }

    public void setKoment(ArrayList koment) {
        this.koment = koment;
    }
}
