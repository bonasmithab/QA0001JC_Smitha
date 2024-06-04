package d26JavaPractice;

import java.util.Scanner;

public class C08_WhileLoops {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a number");
        int num = scan.nextInt();
        int res = num;
        while(res % 10 != 0){
            System.out.println(res);
            res++;
        }
    }
}
