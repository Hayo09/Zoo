package com.ing.zoo.animals;

public class Giraffe extends Animal {
    public Giraffe(String name) {
        super(name);
        this.eatsMeat = false;
        this.eatsLeaves = true;
        this.doesTricks = false;
    }

    public String getName() {
        return super.getName();
    }

    public Boolean getEatsMeat() {
        return super.getEatsMeat();
    }

    public Boolean getEatsLeaves() {
        return super.getEatsLeaves();
    }

    public Boolean getDoesTricks() {
        return super.getDoesTricks();
    }

    public void sayHello() {
        helloText = name + ": *Too high to understand*";
        super.sayHello();
    }

    public void eatLeaves() {
        eatText = name + ": Big tree = big munch";
        super.eatLeaves();
    }
}
