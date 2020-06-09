package com.ing.zoo.animals;

public class Giraffe implements Herbivore {

    private String name;
    private String helloText;
    private String eatText;

    public Giraffe(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void sayHello() {
        helloText = name + ": *Too high to understand*";
        System.out.println(helloText);
    }

    public void eatLeaves() {
        eatText = name + ": Big tree = big munch";
        System.out.println(eatText);
    }
}
