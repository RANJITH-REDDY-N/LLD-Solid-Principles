package com.birdskingdom.birds;

import com.birdskingdom.domain.Bird;
import com.birdskingdom.domain.Soundable;

public class Penguin extends Bird implements Soundable {

    public Penguin(String color, String name, boolean canFly) {
        super(color, name, canFly);
    }
    @Override
    public void eat() {
        System.out.println("I'm Penguin and I eat stuff out of clean water like fish and insects");
    }

    @Override
    public void makeSound() {
        System.out.println("I make suii sounds");
    }
}
