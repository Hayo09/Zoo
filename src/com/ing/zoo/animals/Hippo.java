package com.ing.zoo.animals;

public class Hippo extends Animal{

    public Hippo(String name) {
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

    public void sayHello()
    {
        helloText = name + ": splash";
        super.sayHello();
    }

    public void eatLeaves()
    {
        eatText = name + ": munch munch lovely";
        super.eatLeaves();
    }
}
