package Excercises;

import java.util.Scanner;

public class PracticeSelf {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a degree in Fahrenheit: ");
        double degree = input.nextDouble();
        double result = degree / 2.12;
        System.out.println("Degree in Celsius is: " + result);
    }
}
