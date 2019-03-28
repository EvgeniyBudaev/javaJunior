package lesson9;
//Сложение дробей
public class Main1 {
    public static void main(String[] args) {
        DrobnoeChislo drob1 = new DrobnoeChislo();
        DrobnoeChislo drob2 = new DrobnoeChislo();

        drob1.setChislitel(3);
        drob1.setZnamenatel(15);

        drob2.setChislitel(4);
        drob2.setZnamenatel(18);

//        int commonZnam = 1;
//        for(int i = 1; i < drob1.getZnamenatel()*drob2.getZnamenatel(); i++){
//            if(i % drob1.getZnamenatel() == 0 && i % drob2.getZnamenatel() == 0){
//                commonZnam = i;
//                break;
//            }
//        }
        int result = UtilsForDrobi.commonZnam(drob1, drob2);
        System.out.println(result);
    }
}
