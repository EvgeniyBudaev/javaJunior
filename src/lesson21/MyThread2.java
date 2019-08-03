package lesson21;

public class MyThread2 implements Runnable {
    @Override
    public void run() {
        for (int i = 1000000; i < 1000050; i++) { //то что делает второй поток
            System.out.println(i);
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
