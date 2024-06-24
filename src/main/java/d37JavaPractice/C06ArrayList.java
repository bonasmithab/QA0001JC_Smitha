package d37JavaPractice;

import java.util.*;

public class C06ArrayList {
   // Type the code that shows the count of unique elements in a list of strings.
//        Example: {"apple", "banana", "apple", "orange", "banana", "apple"} ==> 3
   public static void main(String[] args) {

       //1st. way
       List<String> fruits = Arrays.asList("apple", "banana", "apple", "orange", "banana", "apple");
       System.out.println("fruits : " + fruits);

       HashSet<String> uniqueFruits = new HashSet<>(fruits);
       System.out.println("uniqueFruits = " + uniqueFruits);
       
       int uniqueCount = uniqueFruits.size();
       System.out.println("Count of unique elements : " + uniqueCount);



       System.out.println("__________________________________________________________________________");
       //2nd. Way

       List<String> list= Arrays.asList("apple", "banana", "apple", "orange", "banana", "apple");

       Collections.sort(list);
       System.out.println("Sorted list = " + list); //[apple, apple, apple, banana, banana, orange]
       List<String> uniqList=new ArrayList<>();
       String first=null;
       for (String w:list ) {
           if(!w.equals(first)){
               uniqList.add(w);
           }
           first=w;
       }
       System.out.println("uniqList = " + uniqList);
       System.out.println(uniqList.size());

       System.out.println("__________________________________________________________________________");
       //3rd. way
       Set<String> list1 = new HashSet<>(list);
       System.out.println("mySet = " + list1); //mySet = [banana, orange, apple]
       System.out.println("mySet.size() = " + list1.size()); //3

       //4th. way

       long count = list.stream().distinct().count();
       System.out.println("count = " + count);

   }
}
