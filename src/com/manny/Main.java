package com.manny;

public class Main {

    public static void main(String[] args) {
        // While objects can share similar characteristics, they can also be different as well
        // OOP allows us to create classes to inherit commonly used state and behavior
        // from other classes
        Animal animal = new Animal("Animal", 1, 1, 5, 5);

        Dog dog = new Dog("Yorkie", 1, 1, 8, 20, 2, 4, 20, 32, "long silky");
        //dog.eat();
        dog.walk();
        //dog.run();

    }
}
