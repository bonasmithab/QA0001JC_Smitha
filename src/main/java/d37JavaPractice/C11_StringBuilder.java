package d37JavaPractice;

public class C11_StringBuilder {
    //        Write a code that takes a sentence and reverses the order of the words in the sentence by using StringBuilder.
//       your code should maintain the spaces between words. If the input sentence is empty, print "The sentence is empty".
    public static void main(String[] args) {

        String sentence = "Java is a versatile programming language";
        String[] words = sentence.split(" ");

        if (sentence.isEmpty()) {
            System.out.println("The input is empty");
        } else {
            StringBuilder reversed = new StringBuilder();
            for (int i = words.length - 1; i >= 0; i--) {
                reversed.append(words[i]);
                if (i != 0) {
                    reversed.append(" ");
                }
            }
            System.out.println(reversed);
        }
    }

}
