package lesson11.autoru;

public class Tovar {
    private String mainTitle; //название объявления
    private String datePublication; //дата публикации объявления
    private int totalCountViews; //общее количество просмотров
    private int totalCountViewsToday; //количнство просмотров за сегодня
    private int price; //цена
    private Photo[] photos = new Photo[10];
    private String mainText; //комментарий продавца
    private Reviev[] revievs = new Reviev[100];

    public String getMainTitle() {
        return mainTitle;
    }

    public void setMainTitle(String mainTitle) {
        this.mainTitle = mainTitle;
    }

    public String getDatePublication() {
        return datePublication;
    }

    public void setDatePublication(String datePublication) {
        this.datePublication = datePublication;
    }

    public int getTotalCountViews() {
        return totalCountViews;
    }

    public void setTotalCountViews(int totalCountViews) {
        this.totalCountViews = totalCountViews;
    }

    public int getTotalCountViewsToday() {
        return totalCountViewsToday;
    }

    public void setTotalCountViewsToday(int totalCountViewsToday) {
        this.totalCountViewsToday = totalCountViewsToday;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Photo[] getPhotos() {
        return photos;
    }

    public void setPhotos(Photo[] photos) {
        this.photos = photos;
    }

    public String getMainText() {
        return mainText;
    }

    public void setMainText(String mainText) {
        this.mainText = mainText;
    }

    public Reviev[] getRevievs() {
        return revievs;
    }

    public void setRevievs(Reviev[] revievs) {
        this.revievs = revievs;
    }
}
