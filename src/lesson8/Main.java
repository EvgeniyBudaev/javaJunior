package lesson8;
// цикл Switch - почти тоже как if и else
public class Main {
    public static void main(String[] args) {
        int mark = 4;
        switch (mark){
            case 2:
                System.out.println("Очень плохо");
                break;
            case 3:
                System.out.println("Не очень");
                break;
            case 4:
                System.out.println("Хорошо");
                break;
            case 5:
                System.out.println("Отлично");
                break;
            default:
                System.out.println("Вы ввели не оценку");
        }
    }
}
