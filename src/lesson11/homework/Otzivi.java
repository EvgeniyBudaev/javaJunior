package lesson11.homework;

public class Otzivi { //Вкладка "Отзывы"
    private String advantage; //Достоинства
    private String Disadvantages; //Недостатки
    private String comments; //Комментарий
    private int like;
    private int dislike;

    public Otzivi() {

    }

    public Otzivi(String advantage, String disadvantages, int like, int dislike) {
        this.advantage = advantage;
        Disadvantages = disadvantages;
        this.like = like;
        this.dislike = dislike;
    }

    public Otzivi(String advantage, String disadvantages, String comments, int like, int dislike) {
        this.advantage = advantage;
        Disadvantages = disadvantages;
        this.comments = comments;
        this.like = like;
        this.dislike = dislike;
    }

    public String getAdvantage() {
        return advantage;
    }

    public void setAdvantage(String advantage) {
        this.advantage = advantage;
    }

    public String getDisadvantages() {
        return Disadvantages;
    }

    public void setDisadvantages(String disadvantages) {
        Disadvantages = disadvantages;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public int getLike() {
        return like;
    }

    public void setLike(int like) {
        this.like = like;
    }

    public int getDislike() {
        return dislike;
    }

    public void setDislike(int dislike) {
        this.dislike = dislike;
    }
}
