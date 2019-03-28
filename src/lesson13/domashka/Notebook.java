package lesson13.domashka;

public class Notebook extends AbstractDataCarrier implements DataCarrier {
    public Notebook() {
    }

    public Notebook(String text, String nameCarrier, int pageCount) {
        super(text, nameCarrier, pageCount);
    }

    public void printText() {
        //System.out.println("Какой то текст тетради");
        System.out.printf("Какой то текст в тетради , Имя тетради , 10 ", this.getText(), this.getNameCarrier(), this.getPageCount());
        System.out.println();
    }
}
