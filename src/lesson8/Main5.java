package lesson8;

import java.text.SimpleDateFormat;
import java.util.Date;

// ООП. Класс Object
public class Main5 {
    public static void main(String[] args) {
        //работа со временем. Сколько мы выполняем по времени
        long startTime = System.currentTimeMillis(); // сколько времени у нашей системы?
        int summa = 0;
        for(int i = 0; i < 100000;i++){
            summa = summa + i;
        }
        long endTime = System.currentTimeMillis(); //засекли время с момента запуска
        System.out.println(endTime-startTime);

        Date currentDate = new Date(startTime); //определяет дату время год
        System.out.println(currentDate);

        Date time = new Date();

        SimpleDateFormat dateFormat= new SimpleDateFormat("dd/MM/yyyy ' ' HH:mm:ss"); //отфарматировали под читаемый вид
        System.out.println(dateFormat.format(currentDate));

        if (time.after(currentDate)){
            System.out.println("Time созан позже, чем currentDate");

        }
    }
}
