package lesson17;

import java.util.HashMap;
import java.util.Set;

public class Holodilnik {
    private HashMap<String, Integer> products = new HashMap<>();
    private int capasity = 50;  //объем холодильника

    public void addProduct(String product, int value)throws NullPointerException{ //добавляем продукты
        if (product == null){
            throw new NullPointerException("product is null");
        }
        //products.put(product, value); //не совсем корректно работает. Перезатирает
        if (products.containsKey(product)){
            int currentValue = products.get(product); //доcтаем значение по ключу
            int newValue = value + currentValue;
            products.put(product, newValue);
        } else {
            products.put(product, value);
        }
    }

    public void deleteProduct(String product, int value){
        if(!products.containsKey(product)){
            System.out.println("Такого продукта в холодильнике нет");
            return; //просто останавливает метод и метод дальше не срабатывает
        }

        int currentValue = products.get(product);
        if(value > currentValue){
            System.out.println("Вы запрашиваете больше, чем есть в холодильнике");
            return;
        }

        int newValue = currentValue - value;
        if(newValue == 0){
            products.remove(product);
        } else {
            products.put(product,newValue); //перезатерли на новое значение
        }
    }

    public void printListProduct(){
        Set<String> productsName = products.keySet();
        for(String name:productsName){
            System.out.printf("%s - %d кг.", name, products.get(name));
            System.out.println();
        }
    }

}
