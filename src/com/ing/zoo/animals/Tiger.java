package com.ing.zoo.animals;

import java.util.Random;

public class Tiger extends Animal {

    public Tiger(String name) {
        super(name);
        this.eatsMeat = true;
        this.eatsLeaves = false;
        this.doesTricks = true;
    }

    public void sayHello()
    {
        helloText = name + ": rraaarww";
        super.sayHello();
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

    public void eatMeat()
    {
        eatText = name + ": nomnomnom oink wubalubadubdub";
        super.eatMeat();
    }

    public void performTrick()
    {
        Random random = new Random();
        int rnd = random.nextInt(2);
        if(rnd == 0)
        {
            trick = name + ": jumps in tree";
        }
        else
        {
            trick = name + ": scratches ears";
        }
        super.performTrick();
    }
}
