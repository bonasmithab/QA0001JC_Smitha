package d26JavaPractice;

import java.util.Scanner;

public class C03_NestedIf {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a number");
        int num = scan.nextInt();
        if(num < 0 ){
            System.out.println("Negative");
        } else if (num >= 0){
            if(num < 10) {
                System.out.println("Digit");
            }else {
                    System.out.println("Positive");
                }
            }
        }
    }
