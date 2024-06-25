package d38Lambda;

import java.util.ArrayList;
import java.util.List;

public class Lambda08 {

    public static void main(String[] args) {

        List<String> myList = new ArrayList<>();
        myList.add("Ali");
        myList.add("Elif");
        myList.add("Yusuf");
        myList.add("Elif");
        myList.add("Zeynep");
        myList.add("Mustafa");
        System.out.println("myList = " + myList);  //[Ali, Elif, Yusuf, Elif, Zeynep, Mustafa]

    }

    //Print all the elements except starting with "E"

    public static void exceptE(List<String> myList){
        myList.stream().filter(t -> !t.startsWith("E")).forEach(t -> System.out.println(t + " "));

    }
}