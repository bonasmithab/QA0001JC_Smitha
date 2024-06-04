package d26JavaPractice;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class C04_Ternary {
    public static void main(String[] args) {
        /*
Get a number from the user
2.uuse Trnary
-if the entered number is even, print "Even Number" on the console
-if the entered number is odd, increase the number by 3 and print it on the console

Syntax of Ternary = condition ? (true) : (false)
 */

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a number");
        int num = scan.nextInt();
        Object result =  (num > 0 && num % 2 == 0) ? "The number is even" : num + 3;
        System.out.println(result);
    }
}
