package lesson8;
// Работа с буфером
public class Main4 {
    public static void main(String[] args) {
        String s1 = "qwe123qwe456qwe";
        String s2 = "qwe";
        StringBuffer s = new StringBuffer(s1);
        int p = -1;
        while ((p = s.toString().indexOf(s2)) >= 0){
            s.delete(p, p + s2.length());
        }
        s1 = s.toString();
        System.out.println(s1);
    }
}
