package Task1;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        IntegerSet integerSet1 = new IntegerSet();
        integerSet1.addItem(1);
        integerSet1.addItem(23);
        integerSet1.addItem(456);

        ArrayList<Integer> integerList = new ArrayList<Integer>() {{
            add(1);
            add(46);
            add(45);
        }};

        IntegerSet integerSet2 = new IntegerSet(integerList);

        System.out.println("First set: " + integerSet1);
        System.out.println("Second set: " + integerSet2);
        System.out.println("integerSet1 == integerSet2: " +
                (integerSet1.equals(integerSet2)));

        integerSet2.addItem(123);
        integerSet1.deleteItemById(2);

        System.out.println("Second item of integerSet2 = " +
                integerSet2.getItemById(2));
        System.out.println("integerSet2 contains 23: " + integerSet2.contains(23));
        System.out.println("intersections: " + integerSet2.intersections(integerSet1));
    }
}
