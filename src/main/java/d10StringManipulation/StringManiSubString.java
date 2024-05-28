package d10StringManipulation;

public class StringManiSubString {

    public static void main(String[] args) {

        //Example Catch first 4 characters in the given String

        //Substring(starting index) ===. returns part of the string by starting from specified index and to the end of string

        //substring (starting index , ending index) ==> returns part of string that begins with the character
        //specified in first parameter and extends to the character at ending index

        //NOTE: (starting index) first parameter is inclusive
//        (ending index) second parameter is exclusive

        String s = "Java is funny";
        System.out.println("s.substring(0,3) = " + s.substring(0, 3));

        // this is hard way
        int numOfCharacterS = s.length();
        System.out.println("s.length() = " + numOfCharacterS);
        System.out.println(s.substring(0, numOfCharacterS));

        //2second way
        System.out.println("This is easiest way = s.substring(5) = " + s.substring(5));

        // i wanna see "funny" on the console


        //Example: check the given string above if it has funny in it...

        System.out.println("result : " + s.contains("funny"));
    }
}