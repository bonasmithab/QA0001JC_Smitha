package d7IfStatement_Switch;

import java.util.Scanner;

public class NestedIf {
    public static void main(String[] args) {
        /*Scanner input = new Scanner(System.in);
        System.out.println("Enter the customer age and gender");
        int age = input.nextInt();
        String gender = input.next();

        if(gender.equalsIgnoreCase("female") && age > 60){
            System.out.println("She can retire");
        } else if (gender.equalsIgnoreCase("male") && age > 65) {
            System.out.println("He can retire");
        }else {
            System.out.println("she/he can continue to work");
        } */

        //Example: the information provide by customer:
        // if it is female

        //and greater than 60, print "She can retire

        //if it is younger than 60 , print she can continue to work

        //if it is male

        //and if greater than 65, print "He can retire

        // if younger than 65 , print "He can continue to work

        // structure of nested if

        /*
        if(condition1){ for being female

               if(secondary condition for condition1){ for being retire }

        else if(condition2) {  for being male

               if(secondary condition for condition2){ for being retire}

        else{   invalid gender}

         */


        Scanner input = new Scanner(System.in);
        System.out.println("Define your gender....");
        String gender = input.next();

        System.out.println("What is your age?");

        int age = input.nextInt();

        if (age < 0) {
            System.out.println("Age can not be less than 0 ");// entry criteria
        } else if (gender.equalsIgnoreCase("male")) {

            if (age > 65) {
                System.out.println("He can be retire");
            } else {
                System.out.println("He must continue to work");
            }


        } else if (gender.equalsIgnoreCase("female")) {

            if (age > 60) {
                System.out.println("She can be retire");
            } else {
                System.out.println("She must continue to work");
            }
        } else {
            System.out.println("Invalid gender");
        }

    }
}