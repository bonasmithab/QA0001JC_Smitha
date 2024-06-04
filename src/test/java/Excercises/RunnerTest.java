package Excercises;

class Animal {
    String name;

    public Animal(String name) {
        this.name = name;
    }
}

class Dog extends Animal {
    public Dog(String name) {
        super(name); // Calls the superclass constructor
    }

    public void display() {
        System.out.println("Dog's name is " + name);
    }
}

public class RunnerTest {
    public static void main(String[] args) {
        Dog myDog = new Dog("Buddy");
        myDog.display();
    }
}
