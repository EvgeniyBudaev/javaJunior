package lesson21;
//Многопоточность
public class MyThread extends Thread{

    @Override
    public void run() {
        for (int i = 0; i < 10; i++){ //то что делает второй поток
            System.out.println(i);
            try {
                Thread.sleep(500); //останавливаем на полсекунды
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
