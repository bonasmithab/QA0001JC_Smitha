package PracticePolyMorphism;

class Animal {
    void makeSound() {
        System.out.println("This animal makes a sound.");
    }
}

class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println("The dog barks.");
    }
}

class Cat extends Animal {
    @Override
    void makeSound() {
        System.out.println("The cat meows.");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal myAnimal = new Animal();
        Animal myDog = new Dog();
        Animal myCat = new Cat();

        myAnimal.makeSound();  // Outputs: This animal makes a sound.
        myDog.makeSound();     // Outputs: The dog barks.
        myCat.makeSound();     // Outputs: The cat meows.
    }
}

