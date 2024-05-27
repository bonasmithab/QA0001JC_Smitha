package Excercises;

import java.util.Scanner;

public class MethodArrayTest {

    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.println();

    }

    public static Integer m1(String s) {
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (Character.isDigit(ch)) {
                sum = sum + Integer.valueOf(String.valueOf(ch));
            }
        } return sum;

    }
}