package com.ing.zoo.animals;

import java.util.Random;

public class Tiger implements Carnivore, Performer {

    private String name;
    private String helloText;
    private String eatText;
    private String trick;

    public Tiger(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void sayHello()
    {
        helloText = name + ": rraaarww";
        System.out.println(helloText);
    }

    public void eatMeat()
    {
        eatText = name + ": nomnomnom oink wubalubadubdub";
        System.out.println(eatText);
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
        System.out.println(trick);
    }
}
