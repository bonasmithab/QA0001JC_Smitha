package Excercises;
import java.util.Arrays;

public class arrTest {
    public static void main(String[] args) {
        String str= "Javaisalsoeasy";
        String str3="";


        int lengthOfNewArr=0;
        for (int i=0; i<str.length(); i++) {
            char c=str.charAt(i);
            if (str.indexOf(c)!=str.lastIndexOf(c)){

                if (!str3.contains(String.valueOf(c))){
                    str3= str3 + str.charAt(i);
                }
            }
        }
        String []arr = str3.split("");

        System.out.println(Arrays.toString(arr));
    }
}
