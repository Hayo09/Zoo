package com.ing.zoo.animals;

public class Hippo implements Herbivore{

    private String name;
    private String helloText;
    private String eatText;

    public Hippo(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void sayHello()
    {
        helloText = name + ": splash";
        System.out.println(helloText);
    }

    public void eatLeaves()
    {
        eatText = name + ": munch munch lovely";
        System.out.println(eatText);
    }
}
