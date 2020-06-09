package com.ing.zoo.animals;

import java.util.Random;

public class Monkey implements Herbivore, Performer{

    private String name;
    private String helloText;
    private String eatText;
    private String trick;

    public Monkey(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void sayHello() {
        helloText = name + ": OOH OOH AAH AAH";
        System.out.println(helloText);
    }

    public void eatLeaves() {
        eatText = name + ": Small munch with lice JUM";
        System.out.println(eatText);
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
        System.out.println(trick);
    }
}
