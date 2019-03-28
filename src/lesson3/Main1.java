package lesson3;

public class Main1 {
    public static void main(String[] args) { // секундомер
        for (int i = 0; i < 365; i++) {
            for (int j = 0; j < 24; j++ ) {
                for (int k = 0; k < 60; k++) {
                    for (int second = 0; second < 60; second++) {
                        System.out.println("От старта прощло: "+i+" дня, "+j+" часа, "+k+" минут, "+second+" секунд");
                        try {
                            Thread.sleep(1000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }

                    }

                }
            }
        }
    }
}
