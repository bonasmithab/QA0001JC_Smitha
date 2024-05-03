package Excercises;

import java.util.Scanner;

public class intToAndAdd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = input.nextInt();
        int n1 = number%10;
        int n2 = (number / 10 ) % 10;
        int n3 = (number / 100 ) % 10;
        int result = n1 + n2 + n3;

       // if (number>= 0 && number >=1000){
        System.out.println(result);
        }

    }

