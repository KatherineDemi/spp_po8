package task1;
import task1.CD;


public class main {
    public static void main(String[] args) {
        CD cd = new CD();
        cd.addCatalog("first").setCatalog("first_1").setCatalog("first_2").setCatalog("first_3"
        );
        cd.addCatalog("second").setCatalog("second_1").setCatalog("second_2");
        cd.addCatalog("third").setCatalog("third_1").setCatalog("third_2").setCatalog("third_3"
        ).setCatalog("third_4");
        cd.print();
        }
}
