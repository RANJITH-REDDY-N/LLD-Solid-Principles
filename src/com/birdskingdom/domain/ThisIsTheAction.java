package com.birdskingdom.domain;

import com.birdskingdom.birds.Parrot;
import com.birdskingdom.birds.Peacock;
import com.birdskingdom.birds.Penguin;
import com.birdskingdom.birds.Pigeon;

import java.util.ArrayList;
import java.util.List;

public class ThisIsTheAction {
    public static void main(String[] args) {
        Parrot parrot = new Parrot("Parrot Green","Parrot",true);
        Peacock peacock = new Peacock("Blue & Green", "Peacock", true);
        Pigeon pigeon = new Pigeon("Blue & Grayish","Pigeon",true);
        Penguin penguin = new Penguin("Black & White","Penguin", false);

        List<Bird> birds = new ArrayList<>();
        birds.add(parrot);
        birds.add(peacock);
        birds.add(pigeon);
        birds.add(penguin);

        List<Flyable> flyableList = new ArrayList<>();
        List<Dancable> dancableList = new ArrayList<>();
        List<Soundable> soundableList = new ArrayList<>();
        List<Trainable> trainableList = new ArrayList<>();

        for(Bird bird : birds){
            if(bird instanceof Soundable) soundableList.add((Soundable) bird);
            if(bird instanceof Flyable) flyableList.add((Flyable) bird);
            if(bird instanceof Dancable) dancableList.add((Dancable) bird);
            if(bird instanceof Trainable) trainableList.add((Trainable) bird);
        }

        System.out.println(flyableList);
        System.out.println(soundableList);
        System.out.println(dancableList);
        System.out.println(trainableList);

        parrot.fly();
        pigeon.fly();
        peacock.fly();
    }
}
