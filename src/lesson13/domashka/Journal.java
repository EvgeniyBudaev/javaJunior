package lesson13.domashka;

public class Journal extends AbstractDataCarrier implements DataCarrier {
    public Journal() {
    }

    public Journal(String text, String nameCarrier, int pageCount) {
        super(text, nameCarrier, pageCount);
    }

    public void printText() {
        //System.out.println("Какой то текст журнала");
        System.out.printf("Какой то текст журнала , Автору , 30 ", this.getText(), this.getNameCarrier(), this.getPageCount());
        System.out.println();
    }
}
