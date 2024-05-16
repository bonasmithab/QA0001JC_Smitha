package Excercises;

import java.util.Arrays;

public class ArraysMultidimensionalTest {

    public static void main(String[] args) {

        /*String str = "Javaisalsoeasy";
        String[] str1= {};
        for(int i=0; i<str.length()-1; i++){
            String result =  str.indexOf(i).equals(str.lastIndexOf(i));
            System.out.println();*/

        /*String str= "Javaisalsoeasy";
        String str2= "";
        for (int i=0; i<str.length(); i++) {
            if (str.indexOf(i)!=str.lastIndexOf(i)){
                str2 = str2 + str.charAt(i);
                System.out.println(str2);

            }
        }
        String []arr = str2.split("");
        System.out.println(Arrays.toString(arr));*/

                String str = "Javaisalsoeasy";
                String str2 = "";

                // Iterate through each character in the string
                for (int i = 0; i < str.length(); i++) {
                    // Check if the character occurs more than once
                    if (str.indexOf(str.charAt(i)) != str.lastIndexOf(str.charAt(i))) {
                        // Add the character to str2 only if it occurs more than once
                        if (!str2.contains(String.valueOf(str.charAt(i)))) {
                            str2 = str2 + str.charAt(i);
                        }
                    }
                }

                // Split the resulting string into an array of characters
                String[] arr = str2.split("");

                // Print the array
                System.out.println(Arrays.toString(arr));
            }
        }


