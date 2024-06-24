package d37JavaPractice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class C10_ArrayList {
    //    Type code that finds the smallest number in a list and adds this number to both the beginning and the end of the list.
//    If the list is empty, print "The list is empty".
//    10,5,30,20,50

    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>();
        nums.add(10);
        nums.add(5);
        nums.add(30);
        nums.add(20);
        nums.add(50);
        System.out.println("nums = " + nums);

        if(nums.isEmpty()){
            System.out.println("The list is empty");
        } else {
            int smallestNumber = Collections.min(nums);
            nums.add(smallestNumber);
            nums.add(0, smallestNumber);
        }

        System.out.println("new list: " + nums);

    }
}