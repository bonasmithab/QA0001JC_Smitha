package PracticeTasksClasses;

public class Dog2 extends Animal1 {
    public Dog2(String name) {
        super(name); // Calls the superclass constructor
    }
    public void display() {
        System.out.println("Dog's name is " + name);
    }
}
