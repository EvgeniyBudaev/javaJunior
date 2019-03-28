package lesson2;

public class Domashka6 { /* В саду растет 5 яблонь и 3 груши. С каждой яблони мы собираем по 6 ведер яблок, а
                            с каждой груши - по 10 ведер груш. С каждого ведра яблок мы делаем по 4 литра сока, а
                            с каждого ведра груш - по 3 литра. Одного литра сока нам хватает на 2 дня.
                            Рассчитываем: на сколько дней нам хватит сока с обеих деревьев. */
    public static void main(String[] args) {
        int appleTree = 5;
        int pearTree = 3;
        int bucketAppleTree = 6;
        int bucketPearTree = 10;
        int litersBucketAppleTree = 4;
        int litersBucketPearTree = 3;

        int summaBucketAppleTree = bucketAppleTree * appleTree;
        int summaBucketPearTree = bucketPearTree * pearTree;
        int summaLitersBucketAppleTree = summaBucketAppleTree * litersBucketAppleTree;
        int summaLitersBucketPearTree = summaBucketPearTree * litersBucketPearTree;
        int totalSummaLiters = summaLitersBucketAppleTree + summaLitersBucketPearTree;

        int days = totalSummaLiters / 2;
        System.out.println("Количество дней, на которые нам хватит сока: " + days + " дней");
    }
}
