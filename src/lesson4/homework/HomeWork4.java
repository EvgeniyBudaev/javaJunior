package lesson4.homework;

// Входящие параметры: 4 целых числа. Метод должен напечатать на консоль меньшее число из этих четырех чисел.
public class HomeWork4 {

    public static void minFrom4Numbers(int a, int b, int c, int d) {
        if (a <= b && a <= c && a <= d) {
            System.out.println(a);
        } else if (b <= a && b <= c && b <= d) {
            System.out.println(b);
        } else if (c <= a && c <= b && c <= d) {
            System.out.println(c);
        } else if (d <= a && d <= b && d <= c) {
            System.out.println(d);
        }
    }
    public static void minFrom4Numbers(int[] nums){
        int min = nums[0]; //временная переменная
        for (int i = 1; i < nums.length; i++ ){
            if (nums[i] < min){
                min = nums[i];
            }
        }
        System.out.println(min);
    }
}
