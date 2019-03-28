package lesson1;

public class Main1 {
    public static void main(String[] args) {
        int shirinaRoom = 6;
        int dlinnaRoom = 15;
        int shirinaStola = 2;
        int dlinnaStola = 3;

        int kolichestvoStolov = (shirinaRoom * dlinnaRoom) / (shirinaStola * dlinnaStola);

               System.out.println("Количество столов в комнате: " + kolichestvoStolov);
    }
}
