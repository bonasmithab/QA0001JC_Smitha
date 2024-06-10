import java.util.Collections;
import java.util.LinkedList;

public class LinkedListTest {
    public static void main(String[] args) {
        LinkedList<String> c1= new LinkedList<String>();
        c1.add("Red");
        c1.add("Green");
        c1.add("Black");
        c1.add("White");
        c1.add("Pink");
        System.out.println("c1 = " + c1);

        System.out.println(c1.removeAll(c1));

    }
}
