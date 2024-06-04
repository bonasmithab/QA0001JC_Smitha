package d26JavaPractice;

import java.util.Scanner;

public class C05_NestedTernary {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter first number");
        int num1 = scan.nextInt();
        System.out.println("Please enter second number");
        int num2 = scan.nextInt();

        Object res = (num1 == num2) ? "Equal numbers" :
                (num1 > num2) ? (num1 * num1) : (num2 * num2);
        System.out.println(res);

    }
}
