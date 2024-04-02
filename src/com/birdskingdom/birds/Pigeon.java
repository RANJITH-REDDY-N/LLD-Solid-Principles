package com.birdskingdom.birds;

import com.birdskingdom.domain.Bird;
import com.birdskingdom.domain.*;

public class Pigeon extends Bird implements Flyable, Soundable {

    public Pigeon(String color, String name, boolean canFly) {
        super(color, name, canFly);
    }

    FlyBehaviour fb2 = new FlyBehaviour2();
    @Override
    public void eat() {
        System.out.println("I eat by making gur gur sounds");
    }

    @Override
    public void fly() {
        fb2.doFly();
    }

    @Override
    public void makeSound() {
        System.out.println("I make Gurrrr Gurrr sounds on balconies");
    }
}
