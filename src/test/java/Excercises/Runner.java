package Excercises;

import java.awt.*;

public class Runner{
    public static void main(String[] args) {
        Circle obj1 = new Circle(1, 3);
        System.out.println(obj1.center);
        System.out.println(obj1.radius);

        Circle obj2 = new Circle();
        System.out.println(obj2.center);
        System.out.println(obj2.radius);
    }
}
