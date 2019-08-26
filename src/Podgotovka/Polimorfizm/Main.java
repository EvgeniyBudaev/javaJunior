package Podgotovka.Polimorfizm;
/*Полиморфизм — это возможность работать с несколькими типами так, будто это один и тот же тип.
При этом поведение объектов будет разным в зависимости от того, к какому типу они принадлежат.
 */
public class Main {
    public static void main(String[] args) {
        Aibolit aibolit = new Aibolit();

        Lion simba = new Lion();
        Tiger sherkhan = new Tiger();

        aibolit.healCat(simba );
        aibolit.healCat(sherkhan);
    }
}
