package com.birdskingdom.birds;

import com.birdskingdom.domain.*;

public class Parrot extends Bird implements Flyable, Soundable, Trainable {
    public Parrot(String color, String name, boolean canFly) {
        super(color, name, canFly);
    }

    FlyBehaviour fb1 = new FlyBehaviour1();
    @Override
    public void eat() {
        System.out.println("I'm parrot and I eat insects, fruits and flowers with qchicku qchicku!");
    }

    @Override
    public void fly() {
        fb1.doFly();
    }

    @Override
    public void makeSound() {
        System.out.println("I make qui qui sound and I can speak too! I imitate and irritate people !");
    }

    @Override
    public void trainable() {
        System.out.println("I'm trainable and can sound better. Pirate use me as a chatbot! Aye Aye cap'n");
    }
}
