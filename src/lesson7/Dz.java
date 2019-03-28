package lesson7;

public class Dz {
    public static void main(String[] args) {
        int result = StringUtilsDz.countSoglasnie("to be or not to be, that's the question");
        System.out.println(result);

        String result2 = StringUtilsDz.reverse("abc cde");
        System.out.println(result2);

        String result3 = StringUtilsDz.deleteZnakiPrepinania("О, какое чудесное утро! - воскликнул я, подтягиваясь в постели.");
        System.out.println(result3);
    }

}
