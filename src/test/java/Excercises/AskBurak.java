package Excercises;

import java.util.Scanner;

public class AskBurak {
//https://replit.com/@TechProTeam/ENGIfSwitchTernaryStringMeth3#ReadMe.md
    /* Write a Java program to compute and print sum of two given numbers (more than or equal to zero).

If given integers or the sum have more than 10 digits, print "overflow".

EXAMPLE:

INPUT      :
Input two integers:

25

46

OUTPUT :

Sum of the numbers: 71     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        int n1 = input.nextInt();
        int n2 = input.nextInt();
        int sum = n1 + n2;
        if (sum >= 0){
            System.out.println("Sum of n1 and n2:" + sum);
        }if (sum > 1000000000) {
            System.out.println("overflow");
        }

    }
}
