package lesson21.homework;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Man1 implements Runnable {
    boolean flag = true;

    @Override
    public void run() {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        while (flag) {

            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println("Прервано другим потоком");
            }

            synchronized (MonitorImpl.strings) {
                try {
                    MonitorImpl.strings.add(reader.readLine());
                    if (MonitorImpl.strings.get(MonitorImpl.strings.size() - 1).equalsIgnoreCase("exit")) {
                        MonitorImpl.strings.remove(MonitorImpl.strings.size() - 1);
                        flag = false;
                    }
                    MonitorImpl.strings.notify();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }

        }
    }
}
