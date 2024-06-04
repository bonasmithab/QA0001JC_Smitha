package d26JavaPractice;

import java.util.Scanner;

public class C07_ForLoops {
    /*
Ask the user to enter 5 numbers...

calculate the sum of these numbers excluding those whose ones digits is 7 or 9.....

-11
-2
-19
-22
-47
 */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int sum = 0;

        for (int i=0; i<5; i++){

            System.out.println("Please enter a number");
            int number = scan.nextInt();

            if (number%10 !=7 && number%10 !=9){

                sum = sum +number;

            }
        }
        System.out.println("sum = " + sum);
        }

    }

