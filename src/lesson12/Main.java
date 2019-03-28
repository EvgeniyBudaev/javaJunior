package lesson12;

public class Main {
    public static void main(String[] args) {
        Teacher teacher1 = new Teacher();
        Teacher teacher2 = new Teacher();

        Shofer shofer1 = new Shofer(26, "Sam");
        Shofer shofer2 = new Shofer(26, "Sam");
        //Shofer shofer3 = shofer1; //шофер 3 ссылается на шофер 1

        //System.out.println(shofer1.equals(shofer2)); //false до переопределения методов
        //System.out.println(shofer1 == shofer3); //true
        //System.out.println(shofer1.equals(shofer2));//true после переопределения методов

       // System.out.println(shofer1); //автоматически вызывается в sout метод toString если ложим в круглые скобки объект
        // System.out.println(shofer1.toString);
        // lesson12.Shofer@14aa6 выводится до переопределения
        //нужно переопределить
        //Shofer{age=26, name='Sam'} после переопределения

        Rabotnik[] rabotniks = new Rabotnik[4]; //интерфейс Rabotnik выступает как родительский супер класс
        rabotniks[0] = shofer1;
        rabotniks[1] = shofer2;
        rabotniks[2] = teacher1;
        rabotniks[3] = teacher2;

        for(int i = 0; i < rabotniks.length; i++){
            rabotniks[i].doWork();
//            Я шофер, и я еду
//            Я шофер, и я еду
//            Я учитель, и учу людей
//            Я учитель, и учу людей
        }


    }
}
