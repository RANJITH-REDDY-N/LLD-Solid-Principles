package com.birdskingdom.birds;

import com.birdskingdom.domain.*;

public class Peacock extends Bird implements Flyable, Soundable, Dancable {

    public Peacock(String color, String name, boolean canFly) {
        super(color, name, canFly);
    }
    FlyBehaviour fb2 = new FlyBehaviour2();
    @Override
    public void eat() {
        System.out.println("I'm peacock, I eat!");
    }

    @Override
    public void letsDance() {
        System.out.println("Look at me dance! I'm the beautiful dancer of all.");
    }

    @Override
    public void fly() {
        fb2.doFly();
    }

    @Override
    public void makeSound() {
        System.out.println("I make sound so early in the morning by the fields, QUEUE QUEUE");
    }
}
