package d31Maps_Exceptions;

import java.util.HashMap;
import java.util.Map;
import java.util.Arrays;

public class Maps03 {
    public static void main(String[] args) {

        // Example 1: Write code that shows how many times each word is used in a given String.
        //            The operation should be case-insensitive.
        // Mike is Mike.  => mike is mike ==> mike, is, mike
        // expected result => {mike=2, is=1} => map

        String s = "Mike is Mike.";
        /*s = s.replaceAll("[^a-zA-Z ]" , "").toLowerCase();
        String[] word = s.split("\\s+");
        Map<String, Integer> count = new HashMap<>();

        for(String w : word) {
            if(count.containsKey(w)){
                count.put(w, count.get(w) + 1);
            } else {
                count.put(w, 1);
            }
        }
        System.out.println(count); */

        //first step; to remove "." in the container.....
        s = s.replaceAll("\\p{Punct}","").toLowerCase();
        System.out.println("s = " + s);  //s = mike is mike

        //Second step ; to insert in the array structure. Bcause i need to get the element one by one.....
        String [] words = s.split(" ");
        System.out.println("Arrays.toString(words) = " + Arrays.toString(words)); //[mike, is, mike]


        //third step; create an empty map to store words and number of usage

        HashMap<String,Integer> myMapCount = new HashMap<>();

        for (String w:words) {  //[mike, is, mike]

            Integer usage = myMapCount.get(w);

            if (usage == null){

                myMapCount.put(w,1);

            }else{

                myMapCount.put(w,usage+1);

            }

        }
        System.out.println("myMapCount = " + myMapCount); //myMapCount = {mike=2, is=1}
    }
}
