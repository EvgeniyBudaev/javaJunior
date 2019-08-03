package lesson21.homework;

public class Printer extends Thread {
    @Override
    public void run() {
        while (MonitorImpl.strings.isEmpty()) { //пока нет переданного текста
            synchronized (MonitorImpl.strings) {
                try {
                    MonitorImpl.strings.wait(); //наш принтер в режиме ожидания
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                if(MonitorImpl.strings.size() > 0){
                    System.out.println(MonitorImpl.strings.remove(0));
                }
            }
        }
    }
}
