package com.ing.zoo.animals;

import java.util.Random;

public class Monkey extends Animal{
    public Monkey(String name) {
        super(name);
        this.eatsMeat = false;
        this.eatsLeaves = true;
        this.doesTricks = true;
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
        helloText = name + ": OOH OOH AAH AAH";
        super.sayHello();
    }

    public void eatLeaves() {
        eatText = name + ": Small munch with lice JUM";
        super.eatLeaves();
    }

    public void performTrick() {
        Random random = new Random();
        int rnd = random.nextInt(2);
        if(rnd == 0)
        {
            trick = name + ": Stands on big ball and smacks cymbal(ting ting ting)";
        }
        else
        {
            trick = name + ": ignores";
        }
        super.performTrick();
    }
}
