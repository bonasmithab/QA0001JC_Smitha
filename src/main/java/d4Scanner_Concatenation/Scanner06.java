package d4Scanner_Concatenation;

import java.util.Scanner;

public class Scanner06 {

    public static void main(String[] args) {
//Example: Ask user to enter the width and the length of a rectangle
//Then print the area and perimeter on the console

//Area: width*length
//Perimeter = 2*width + 2*length
        Scanner entry = new Scanner(System.in);
        System.out.println("Enter the width and length of a rectangle: ");
        float width = entry.nextFloat();
        float length = entry.nextFloat();

        System.out.println("Area = " + (width * length));
        System.out.println("Perimeter = " + (2*width + 2*length) );

    }
}
