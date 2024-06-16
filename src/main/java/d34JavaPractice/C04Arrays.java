package d34JavaPractice;

import org.example.Main;

import java.util.Arrays;

public class C04Arrays {

    //Type code to find all array elements that contain the substring "abc".

    public static void main(String[] args) {
        String[] arr = new String[]{"abctest", "hello", "xyzabc", "testabcxyz", "noabc"};
        System.out.println("Array = " + Arrays.toString(arr));


        for (String s : arr) {
            if (s.contains("abc")) {
                System.out.println(s);
            }
        }
    }
}


