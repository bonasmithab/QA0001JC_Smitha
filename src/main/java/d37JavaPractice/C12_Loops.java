package d37JavaPractice;

import java.util.Scanner;

public class C12_Loops {
    //Write a code  that calculates the factorial of a given number from user
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = input.nextInt();

        int factorial = 1;

        for(int i = 1; i <=num; i++){
            factorial = factorial * i;
        }
        System.out.println("factorial of the number = " + factorial);
    }
}
