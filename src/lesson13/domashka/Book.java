package lesson13.domashka;

public class Book extends AbstractDataCarrier implements DataCarrier {
    public Book() {
    }

    public Book(String text, String nameCarrier, int pageCount) {
        super(text, nameCarrier, pageCount);
    }

    public void printText() {
        System.out.printf("Какой то текст книги , Война и мир , 500 ", this.getText(), this.getNameCarrier(), this.getPageCount());
        System.out.println();
    }

}
