package d37JavaPractice;

import java.util.ArrayList;

public class C05ArrayList {
//        Decrease the value of every element that is greater than 20 by 5 in a list. If the element is 20 or less,
//        multiply it by 2.

//        [20, 30, 25, 20, 40]
public static void main(String[] args) {
    ArrayList<Integer> num = new ArrayList<>(5);
    num.add(20);
    num.add(30);
    num.add(25);
    num.add(20); 
    num.add(40);

    System.out.println("num = " + num);

    for (int i = 0; i<num.size(); i++){
        int value = num.get(i);
        if(value > 20) {
            num.set(i, value -5);
        } else {
            num.set(i, value * 2);
        }
    }
    System.out.println("num new list = " + num);
}
}
