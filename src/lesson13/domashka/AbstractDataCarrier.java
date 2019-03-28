package lesson13.domashka;

public abstract class AbstractDataCarrier implements DataCarrier{
    private String text;
    private String nameCarrier;
    private int pageCount;

    public AbstractDataCarrier(){

    }

    public AbstractDataCarrier(String text, String nameCarrier, int pageCount) {
        this.text = text;
        this.nameCarrier = nameCarrier;
        this.pageCount = pageCount;
    }

    public String getText() {return text;}
    public String getNameCarrier() {return nameCarrier;}
    public int getPageCount() {return pageCount;}

    public void setText(String text){this.text = text;}
    public void setNameCarrier(String nameCarrier){this.nameCarrier = nameCarrier;}
    public void setPageCount(int pageCount){this.pageCount = pageCount;}

    @Override
    public void printText() {


    }

    @Override
    public void printNameCarrier() {

    }

    @Override
    public void printPageCount() {

    }
}
