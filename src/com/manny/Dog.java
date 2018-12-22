package com.manny;

public class Dog extends Animal {

    //Java allows you to create a base class (Animal) that's go the basic
    // info to work on, and then you can extend from that class

    private int eyes;
    private int legs;
    private int tail;
    private int teeth;
    private String coat;

    public Dog(String name, int brain, int body, int size, int weight, int eyes, int legs, int tail, int teeth, String coat) {
        super(name, 1, 1, size, weight);
        // What super means is to call a constructor that is for the
        // class that we're extending from.
        // This allows us to initialize the Animal class's base
        // characteristics in the Dog class
        // Because we are working in the Dog class, we can assign
        // extra State(fields) and extra Behavior(methods) that are unique
        // for a Dog, and not necessarily applicable for an Animal.
            this.eyes = eyes;
            this.legs = legs;
            this.tail = tail;
            this.teeth = teeth;
            this.coat = coat;

    }

    private void chew(){
        System.out.println("Dog.chew() called");
    }

    @Override
    public void eat() {
        System.out.println("Dog.eat() called");
        chew();
        super.eat();
    }

    public void walk(){
        System.out.println("Dog.walk() called");
        super.move(5);
    }

    public void run(){
        System.out.println("Dog.run() called");
        move(10);
    }


    private void moveLegs(int speed){
        System.out.println("Dog.moveLegs() called");
    }

    @Override
    public void move(int speed) {
        System.out.println("Dog.move() called");
        moveLegs(speed);
        super.move(speed);
    }
}
