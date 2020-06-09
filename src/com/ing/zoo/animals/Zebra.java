package com.ing.zoo.animals;

public class Zebra implements Herbivore{

    private String name;
    private String helloText;
    private String eatText;

    public Zebra(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void sayHello()
    {
        helloText = name + ": zebra zebra";
        System.out.println(helloText);
    }

    public void eatLeaves()
    {
        eatText = name + ": munch munch zank yee bra";
        System.out.println(eatText);
    }
}
