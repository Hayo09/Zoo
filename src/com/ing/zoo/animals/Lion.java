package com.ing.zoo.animals;

public class Lion extends Animal {


    public Lion(String name) {
        super(name);
        this.eatsMeat = true;
        this.eatsLeaves = false;
        this.doesTricks = false;
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
        helloText = name + ": roooaoaaaaar";
        super.sayHello();
    }

    public void eatMeat()
    {
        eatText = name + ": nomnomnom thx mate";
        super.eatMeat();
    }
}
