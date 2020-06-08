package com.ing.zoo.animals;

import java.util.Random;

public class Pig extends Animal{

    public Pig(String name) {
        super(name);
        this.eatsMeat = true;
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

    public void sayHello()
    {
        helloText = name + ":Squeel";
        super.sayHello();
    }

    public void eatLeaves()
    {
        eatText = name + ": munch munch oink";
        super.eatLeaves();
    }

    public void eatMeat()
    {
        eatText = name + ": nomnomnom oink thx";
        super.eatMeat();
    }

    public void performTrick()
    {
        Random random = new Random();
        int rnd = random.nextInt(2);
        if(rnd == 0)
        {
            trick = name + ": rolls in the mud";
        }
        else
        {
            trick = name + ": runs in circles";
        }
        super.performTrick();
    }
}
