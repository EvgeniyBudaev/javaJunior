package lesson13.domashka;

public class Main {
    public static void main(String[] args) {

        Book book = new Book("текст книги", "Название книги", 500);
        Journal journal = new Journal("текст журнала", "Название журнала", 30);
        Notebook notebook = new Notebook("текст тетради", "Название тетради", 10);

        AbstractDataCarrier[] carrier = new AbstractDataCarrier[3];
        carrier[0] = book;
        carrier[1] = journal;
        carrier[2] = notebook;

        for(int i = 0; i < carrier.length; i++){
            carrier[i].printText();
        }

    }
}
