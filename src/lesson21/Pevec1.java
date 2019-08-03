package lesson21;

public class Pevec1 extends Thread {
    private boolean stop = false;

    @Override
    public void run() {
        int count = 0;
        while (!stop){
            count++;
            for(int i = 0; i < 3; i++){
                System.out.println(" --------- LA");
                try {
                    Thread.sleep(300);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }

            synchronized (Monitors.MICROFON){
                try {
                    Monitors.MICROFON.notify();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }

            synchronized (Monitors.MICROFON){ //сюда может зайти исключительно один обьект
                try {
                    Monitors.MICROFON.wait();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }

            if(count > 3){
                stop = true;
            }
        }
    }
}
