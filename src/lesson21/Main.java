package lesson21;

public class Main {
    public static void main(String[] args) {
        //второй поток
        MyThread myThread = new MyThread();
        myThread.setName(" Повар "); //дали имя потоку
        myThread.start();

        //Третий поток
        Thread myThread2 = new Thread(new MyThread2());
        myThread2.start();

        //первый поток
        Thread.currentThread().setName(" Официант ");
        for(int i = 1000; i < 1020; i++){
            System.out.println(i + "====" + Thread.currentThread().getName());
            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
