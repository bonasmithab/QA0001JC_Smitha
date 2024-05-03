package Excercises;

import java.util.Scanner;

public class StringManipulationTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your name, surname and credit card number ");
        String name = input.next();
        String surName = input.next();
        input.nextLine();
        String creditCardNum = input.nextLine();

        name = name.toLowerCase();
        String firstLetter = name.substring(0, 1).toUpperCase();
        name = firstLetter + name.substring(1);
        System.out.println("name :" + name);

        String firstLetter1 = surName.substring(0, 1).toUpperCase();
        surName = surName.toLowerCase();
        surName = firstLetter1 + surName.substring(1);
        System.out.println("surname = " + surName);

        if(creditCardNum.length() != 16){
            System.out.println("Please enter valid Credit Card number");
        } else {
            String lastDigits = creditCardNum.substring(12);
            String stars = creditCardNum.substring(0 , 12).replaceAll("[0-9]" , "*");
            System.out.println(stars + lastDigits);
        }

    }
}
