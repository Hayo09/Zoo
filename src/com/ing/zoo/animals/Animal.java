package com.ing.zoo.animals;

public class Animal {

    protected String name;
    protected String helloText;
    protected String eatText;
    protected String trick;
    protected Boolean eatsMeat;
    protected Boolean eatsLeaves;
    protected Boolean doesTricks;

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Boolean getEatsMeat() {
        return eatsMeat;
    }

    public Boolean getEatsLeaves() {
        return eatsLeaves;
    }

    public Boolean getDoesTricks() {
        return doesTricks;
    }

    public void sayHello(){
        System.out.println(helloText);
    }

    public void eatMeat(){
        System.out.println(eatText);
    }

    public void eatLeaves(){
        System.out.println(eatText);
    }

    public void performTrick(){
        System.out.println(trick);
    }
}
