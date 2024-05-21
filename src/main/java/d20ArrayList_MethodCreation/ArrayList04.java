package d20ArrayList_MethodCreation;

import java.util.ArrayList;

import static java.util.Collections.sort;

public class ArrayList04 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(12);
        numbers.add(23);
        numbers.add(10);
        numbers.add(19);

        System.out.println(numbers);
        sort(numbers);
        int closestDifference = Integer.MAX_VALUE;
        int num1 = 0;
        int num2 = 0;
        for(int i=0; i< numbers.size(); i++){
            int difference = Math.abs(numbers.get(i) - numbers.get(i+1));
            System.out.println(difference);
            if (difference < closestDifference){
                num1 = numbers.get(i);
                num2 = numbers.get(i + 1);

            }
            System.out.println("closest numbers: " +num1+ "and" +num2);
        }
        System.out.println(closestDifference);

    }
}
