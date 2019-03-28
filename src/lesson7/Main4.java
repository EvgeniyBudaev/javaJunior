package lesson7;

public class Main4 {
    public static void main(String[] args) {
        String message = "qwerty i am...";

        StringUtils.coddingMessage(message);
        String coddingMessage = StringUtils.coddingMessage(message);
        System.out.println(coddingMessage);

//        StringUtils.
//        String glasnieBukvi = StringUtils.codingMassage(massage);

        int result1  = StringUtils.countGlasnie("qwerty");
        int result2 = StringUtils.countGlasnie("dfafafrjuki dgsgehbuoi");
        System.out.println(result1);
        System.out.println(result2);
    }
}
