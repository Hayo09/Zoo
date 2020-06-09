package com.ing.zoo.animals;

import java.util.Random;

public class Pig implements Carnivore, Herbivore, Performer{

    private String name;
    private String helloText;
    private String eatText;
    private String trick;

    public Pig(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void sayHello()
    {
        helloText = name + ":Squeel";
        System.out.println(helloText);
    }

    public void eatLeaves()
    {
        eatText = name + ": munch munch oink";
        System.out.println(eatText);
    }

    public void eatMeat()
    {
        eatText = name + ": nomnomnom oink thx";
        System.out.println(eatText);
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
        System.out.println(trick);
    }
}
