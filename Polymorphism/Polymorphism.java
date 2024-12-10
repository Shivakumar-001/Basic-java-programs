/*Polymorphism using Method Overriding:*/

// Superclass
class Animal {
    // Method to be overridden
    public void sound() {
        System.out.println("Animal makes a sound");
    }
}

// Subclass
class Dog extends Animal {
    // Overriding the sound method
    public void sound() {
        System.out.println("Dog barks");
    }
}

// Subclass
class Cat extends Animal {
    // Overriding the sound method
    public void sound() {
        System.out.println("Cat meows");
    }
}

public class Polymorphism{
    public static void main(String[] args) {
        // Creating objects of different classes
        Animal animal = new Animal();
        Animal dog = new Dog(); // Upcasting
        Animal cat = new Cat(); // Upcasting

        // Calling the overridden method
        animal.sound();
        dog.sound();
        cat.sound();
    }
}


/* 
Output:

Animal makes a sound
Dog barks
Cat meows

*/