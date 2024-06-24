package d37JavaPractice;

import java.util.Scanner;

public class C07StringManipulation {
    //Write a code that prints the longest word in a sentence taken from the user.
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a sentence : ");
        String sentence = input.nextLine();
        String[] words = sentence.replaceAll("[\\p{Punct}]", "").trim().split(" ");

        String longestWord = "";
        int maxWord = 0;

        for(String w : words){
            if (w.length() > maxWord){
                longestWord = w;
                maxWord = w.length();
            }
        }
        System.out.println("Longest Word = " + longestWord);
    }
}
