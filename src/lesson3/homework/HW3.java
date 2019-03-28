package lesson3.homework;

public class HW3 {
    public static void main(String[] args) {
        int znam1 = 8;
        int znam2 = 6;

        int commonZnam = 1;
        while (true) {
            if (commonZnam % znam1 == 0 && commonZnam % znam2 == 0) {
                System.out.println(commonZnam );
                break;
            } else {
                commonZnam++;
            }
        }
    }
}
