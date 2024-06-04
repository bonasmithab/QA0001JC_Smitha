package d28OOP_Collections;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Set01 {

    public static void main(String[] args) {

        //Sets are used to store unique elements......
        //For Example; national id, fingerPrint, email, driver license, city plate number......

        /*
        1) HashSet; This set stores elements based on their hash code.... Elments are stored in a structure
        where each has unique element is added it has hash code is calculated.....
        and placed in a cell corresponding to that hash code...
         */

        /*
        HashSet offer the fastest performance. But they do not maintain the order elements.....


         */

        String a = "ac";
        System.out.println(a.hashCode()); //3106

        String b = "accordion";
        System.out.println("b.hashCode() = " + b.hashCode()); //-1830107832

        /*
        LinkedHashSet
          this set store elements based on their additional order...  (insertion order)
          the linkedHashSets are good choice for applications that require maintaning the order of the elements.
          however they offer slower perfomance than HashSet.....

          //TreeSet;
          This set stores elements based on their natural order(smallest to largest)
          it offers slower performance than HashSets and linkedHashSet
          in java, treeSet is a class that implements the sortedInterface...
          thats why treeSet is a sorted set......


         */

        //how to create a HashSet?????
        HashSet<String> hs = new HashSet<>();
        System.out.println("hs = " + hs); //hs = []

        //how to add elements to HashSet......
        hs.add("Ismail");
        hs.add("Masuma");
        hs.add("Anna");
        hs.add("Melek");
        System.out.println("hs = " + hs); //hs = [Melek, Ismail, Masuma, Anna]

        //if i add same element, what will happen on the console?
        hs.add("Ismail"); //it will be iverwritten to existing one. You wont get any error.......
        System.out.println("hs = " + hs); //hs = [Melek, Ismail, Masuma, Anna]
        hs.add(null);
        System.out.println("hs.add(null) = " + hs); //hs.add(null) = [null, Melek, Ismail, Masuma, Anna]

        HashSet<String> hs2 = new HashSet<>(Arrays.asList("Derya", "Kamola"));

        Set<String> hs3 = Set.of("Martin", "Barbara");

        System.out.println("hs3 = " + hs3); //hs3 = [Martin, Barbara]


        System.out.println("================LINKED HASHSET=============");



    }
}