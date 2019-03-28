package lesson9;

import java.sql.SQLOutput;

public class Book {
    private int page;
    private String name;
    private String autor;
    private int price;
    private int year;
    //Конструкторы ниже
    public Book(){ //пустой конструктор лучше создавать для будующего всегда
        System.out.println("Книга. Вызвали конструктор");
    }
    public Book(String nameB, String autorB){
        name = nameB;
        autor = autorB;
    }
    public Book(int pageB, String nameB, String autorB, int priceB, int yearB){
        page = pageB;
        name = nameB;
        autor = autorB;
        price = priceB;
        year = yearB;
    }
    //метод для вывода на консоль
    public void print(){
        System.out.printf("Название книги - %s, автор - %s", name, autor); //динамически подстраиваемся. %d если int значение
    }
}
