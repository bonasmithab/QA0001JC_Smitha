package d39Lambda;

import java.util.ArrayList;
import java.util.List;

public class Lambda13 {

    public static void main(String[] args) {


        List<String> myList = new ArrayList<>();
        myList.add("Ali");
        myList.add("Elif");
        myList.add("Yusuf");
        myList.add("Solomon");
        myList.add("Jesus");
        myList.add("Mustafa");
        System.out.println("Original: " + myList);

        //removeIfGreaterThanFive(myList);
        //removeElements(myList);
        removeElementsContainingI(myList);
    }


    //Example: Delete the elements whose length are greater than 5


    public static void removeIfGreaterThanFive(List<String> myList) {

        myList.removeIf(t -> t.length() > 5);
        System.out.println(myList);

    }

    //2way

    //remove the elements startsWith and endsWithMethods...
    // remove elements which is start J or endswith f

    public static void removeElements(List<String> myList) {

        myList.removeIf(t -> t.startsWith("J") || t.endsWith("f"));
        System.out.println(myList);

    }

    //Example; remove the elements containing "i"
    public static void removeElementsContainingI(List<String> myList){

        myList.removeIf(t-> t.contains("i"));
        System.out.println(myList);

    }

}