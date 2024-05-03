package Excercises;

import java.sql.SQLOutput;

public class namesEvenAndOdd {
    public static void main(String[] args) {
        String name1 = "mehmet";
        String name2 = "ahmet";
        String name = (name1.length() % 2 == 0) ? (name1.substring(0, name1.length()/2)+name2+name1.substring(name1.length()/2)) :
                ("Name2 cannot be inserted in the name1");
        System.out.println(name);
        //if (name1.length()%2==0){
           // System.out.println(name1.substring(0,(name1.length())/2)+name2+name1.substring(name1.length()/2));
        //}else System.out.println("Name2 cannot be inserted in the name1");
    }
}
