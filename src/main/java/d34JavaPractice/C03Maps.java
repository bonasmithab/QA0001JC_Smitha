package d34JavaPractice;

import java.util.HashMap;
import java.util.Map;

public class C03Maps {
    //Create a map
    /*
    add elements as key and as values
    Laptop = 1200
    Tv = 800
    Refrigerator = 1500
    Music System = 600

   in the map Contains product names as keys and their prices as values,
    write code to check if there is any product with a price greater than 1000 and print all such products.


     */

    public static void main(String[] args) {
        HashMap<String, Integer> myMap = new HashMap<>();
        myMap.put("Laptop", 1200);
        myMap.put("Tv", 800);
        myMap.put("Refrigerator", 1500);
        myMap.put("Music System", 600);
        System.out.println("myMap = " + myMap);

        for (Map.Entry<String, Integer> w : myMap.entrySet()) {

            if (w.getValue() > 1000) {
                System.out.println(w.getKey() + " 's Price is " + w.getValue());
            }

        }

    }
}
