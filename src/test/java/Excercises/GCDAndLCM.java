package Excercises;

import java.util.Scanner;

public class GCDAndLCM {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
        System.out.println("Enter two integer numbers : ");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int gcd = 1;
        for(int i = 1; i<= num1 && i <=num2; ++i){
            if (num1 % i == 0 && num2 % i == 0){
                gcd = i;
            }
        }
        int lcm = (num1 * num2) / gcd;
        System.out.println("GCD for" + num1 + "and" + num2 + "=" + gcd);
        System.out.println("LCM for" + num1 + "and" + num2 + "=" + lcm );

       /* int a=30;
        int b=40;


        double gcd=1;//10
        double lcm;//120
        for (int i=1;i<=40;i++) {
            if ((a%i==0)&&(b%i==0)){
                gcd=i;

            }
        }
        lcm = (a * b) / gcd;
        System.out.println("gcd="+gcd);
        System.out.println("lcm = " + lcm); */
    }
}
