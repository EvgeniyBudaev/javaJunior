package lesson21;

public class Pevec2 extends Thread {

    @Override
    public void run() {
        while (true){
            synchronized (Monitors.MICROFON){
                try {
                    Monitors.MICROFON.wait();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }

            for(int i = 0; i < 2; i++){
                System.out.println(" FA ------- ");
                try {
                    Thread.sleep(500);
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

        }
    }
}
