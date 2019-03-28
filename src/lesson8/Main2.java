package lesson8;

public class Main2 {
    public static void main(String[] args) {
//        String text = "sdfsf\" sf\\dfs";
//        System.out.println(text);

        int apple = 20;
//        if(apple > 15){
//            System.out.println("Хватит");
//        } else {
//            System.out.println("Не хватит");
//        }
        // тернарный оператор
        String result = (apple > 15) ? "Хватит" : "Не хватит";
        System.out.println(result);
    }
}
