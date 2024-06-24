package d37JavaPractice;

import java.util.Scanner;

public class C13_Loops {
    // get a word from user.
//The loop should continue Until the character 'c' is encountered in the word.
// Count the number of 'a' characters in the word up to that point.
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a word: ");
        String word = input.next();

        int countCh = 0;

        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);

            if (ch == 'c') {
                break;
            }
            if (ch == 'a' || ch == 'A') {
                countCh++;
            }
        }
        System.out.println(countCh);
        System.out.println("______________________");


        Scanner input1 = new Scanner(System.in);
        System.out.println("Enter a Sentence: ");
        String word1 = input1.nextLine();
        String[] arr = word1.split("");

        for (String w : arr) {
            int counter = 0;
            for (int i = 0; i < w.length(); i++) {
                if ((w.charAt(i)) == 'c') {
                    break;
                }
                if ((w.charAt(i)) == 'a') {
                    counter++;
                }
            }System.out.println(counter);
        }
    }
}
