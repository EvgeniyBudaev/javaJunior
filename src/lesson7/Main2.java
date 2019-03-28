package lesson7;

public class Main2 {
    public static void main(String[] args) {
        String text1 = "I am studing java";
        String text2 = "Where i am ... ?";

        boolean ifContainIAm = text1.regionMatches(true,0,text2,6, 4); // true - игнорирует регистр в тексте
        System.out.println(ifContainIAm);

        int compare = text1.compareTo(text2); // метод для сортировки
        System.out.println(compare);
    }
}
