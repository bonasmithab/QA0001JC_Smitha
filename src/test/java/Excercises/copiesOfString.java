package Excercises;

import java.sql.SQLOutput;
import java.util.Scanner;

public class copiesOfString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a word");
        //String word = input.nextLine();
        //String result =  (word.length() >= 2) ? (word.substring(word.length() - 2)) : ("There must be atleast 2 letters");
        //System.out.println(result);

        String word = input.nextLine();
        String result =  (word.length() >= 2) ? (word.substring(word.length() - 2)
                +word.substring(word.length() - 2)
                +word.substring(word.length() - 2)) :
                "There must be atleast 2 letters";
        System.out.println(result);
    }
}
