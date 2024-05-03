package Excercises;

import java.util.Scanner;

public class UniqueAndDuplicateChars {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a name with 3 characters");
        String name = input.next();
        String result = (name.length() == 3) ?
                (name.charAt(0) == name.charAt(1) || name.charAt(1) == name.charAt(2)
                        || name.charAt(2) == name.charAt(0)) ?
                ("String has duplicate characters") : ("String has unique characters") : ("Invalid name");
        System.out.println(result);


       /* String name=input.next();
        char a=name.charAt(0);
        char b=name.charAt(1);
        char c=name.charAt(2);


        String duplicate = (name.length() == 3)?
                            (a==b||b==c||c==a) ?
                                    ("String has duplicate character"):("String has unique character"):("invalid length");
        System.out.println(duplicate); */
    }
}
