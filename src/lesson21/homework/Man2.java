//package lesson21.homework;
//
//import java.io.BufferedReader;
//import java.io.InputStreamReader;
//
//public class Man2 extends Thread {
//    @Override
//    public void run() {
//        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//        while (true){
//            synchronized (MonitorImpl.strings){
//                try {
//                    MonitorImpl.strings.wait();
//                }catch (Exception e){
//                    e.printStackTrace();
//                }
//            }
//
//            try {
//                MonitorImpl.strings.add(reader.readLine());
//                if(MonitorImpl.strings.get(MonitorImpl.strings.size()-1).equalsIgnoreCase("exit")){
//                    MonitorImpl.strings.remove(MonitorImpl.strings.size()-1);
//                    break;
//                }
//                MonitorImpl.strings.notify();
//            }catch (Exception e){
//                e.printStackTrace();
//            }
//
//        }
//    }
//}
