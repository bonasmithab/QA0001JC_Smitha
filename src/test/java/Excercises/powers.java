package Excercises;

import java.util.Scanner;

public class powers {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter a number: ");
        Double num = input.nextDouble();
        double square = num * num;
        double cube = getCube(num);
        double fourth = Math.pow(num, 10);
        System.out.println("Square: " + square);
        System.out.println("Cube: " + cube);
        System.out.println("fourth: " + fourth);
;    }

    private static double getCube(Double num) {
        return num * num * num;
    }
}
