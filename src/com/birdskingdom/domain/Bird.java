package com.birdskingdom.domain;

public abstract class Bird {
    private String color;
    private String name;
    private boolean canFly;
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isCanFly() {
        return canFly;
    }

    public void setCanFly(boolean canFly) {
        this.canFly = canFly;
    }

    public abstract void eat();

    public Bird(String color, String name, boolean canFly) {
        this.color = color;
        this.name = name;
        this.canFly = canFly;
    }

    @Override
    public String toString() {
        return "Bird{" +
                "color='" + color + '\'' +
                ", name='" + name + '\'' +
                ", canFly=" + canFly +
                '}';
    }
}
