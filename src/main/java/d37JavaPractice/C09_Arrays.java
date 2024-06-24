package d37JavaPractice;

import java.util.ArrayList;
import java.util.List;

public class C09_Arrays {
    // Finding the longest word(s) in a given string and printing their length, and print the longest word on the console....
    public static void main(String[] args) {
        String s = "Java is a versatile and powerful programming language. That's why we need to finish java homeworks";

        String[] words = s.replaceAll("[^a-zA-Z]", "").split(" ");
        List<String> word = new ArrayList<>();

        String longestWord = "";

        for (String w : words) {

            if (w.length() > longestWord.length()) {

                longestWord = w;
            }

        }
        System.out.println("The longest word is : " + longestWord);
    }
}