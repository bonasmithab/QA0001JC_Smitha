package Excercises;

import java.util.Arrays;

public class LoopsTest01 {
    public static void main(String[] args) {

        String str = "a:b;c....!!!";
        String str1 = str.replaceAll("[\\p{Punct} && [^;.]]","1" );
        System.out.println(str1);



    }
}
