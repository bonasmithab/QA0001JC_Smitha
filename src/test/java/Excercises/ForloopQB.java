package Excercises;

public class ForloopQB {
    public static void main(String[] args) {

        /* for(int i = s.length()-1; i > -1; i--){
            char c = s.charAt(i);
            if(s.indexOf(c)==!s.lastIndexOf(c)){
            System.out.print(c); */
        String s = "John came late home";
        for(int i = s.length()-1; i>-1; i--){
            char c = s.charAt(i);
            if(s.indexOf(c) != s.lastIndexOf(c)){
                System.out.print(c + " ");
            }
        }
    }
}

