package com.ing.zoo.animals;

public class Lion implements Carnivore {

    private String name;
    private String helloText;
    private String eatText;

    public Lion(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void sayHello()
    {
        helloText = name + ": roooaoaaaaar";
        System.out.println(helloText);
    }

    public void eatMeat()
    {
        eatText = name + ": nomnomnom thx mate";
        System.out.println(eatText);
    }
}
