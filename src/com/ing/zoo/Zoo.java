package com.ing.zoo;

import com.ing.zoo.animals.*;

import java.util.*;

public class Zoo {
    public static void main(String[] args) {

        List<String> commands = Arrays.asList(
                "hello",
                "give leaves",
                "give meat",
                "perform trick",
                "stop"
        );
        // init animals
        Lion alex = new Lion("Alex");
        Hippo gloria = new Hippo("Gloria");
        Pig rick = new Pig("Rick");
        Tiger wally = new Tiger("Wally");
        Zebra marty = new Zebra("Marty");
        Giraffe melman = new Giraffe("Melman");
        Monkey julian = new Monkey("Julian");
        // assigning animals to the right groups
        List<Animal> animals = Arrays.asList(alex, gloria, rick, wally, marty, melman, julian);
        List<Carnivore> carnivores = Arrays.asList(alex, rick, wally);
        List<Herbivore> herbivores = Arrays.asList(gloria, rick, marty, melman, julian);
        List<Performer> performers = Arrays.asList(rick, wally, julian);

        Scanner scanner = new Scanner(System.in);
        String input;
        String[] splittedInput;

        boolean loop = true;
        while (loop) {

            System.out.println("\nCommands:");
            commands.forEach(System.out::println);
            System.out.print("Voer uw command in: ");

            input = scanner.nextLine();
            input = input.toLowerCase();
            splittedInput = input.split(" ", 0);
            System.out.println();

            if (input.contains(commands.get(0))) {
                if (splittedInput.length == 1) {
                    animals.forEach(Animal::sayHello);
                } else {
                    for (Animal animal : animals) {
                        if (animal.getName().toLowerCase().equals(splittedInput[1])) {
                            animal.sayHello();
                        }
                    }
                }
            } else if (input.contains(commands.get(1))) {
                if (splittedInput.length == 2) {
                    herbivores.forEach(Herbivore::eatLeaves);
                } else {
                    for (Herbivore herbivore : herbivores) {
                        if (herbivore.getName().toLowerCase().equals(splittedInput[2])) {
                            herbivore.eatLeaves();
                        }
                    }
                }
            } else if (input.contains(commands.get(2))) {
                if (splittedInput.length == 2) {
                    carnivores.forEach(Carnivore::eatMeat);
                } else {
                    for (Carnivore carnivore : carnivores) {
                        if (carnivore.getName().toLowerCase().equals(splittedInput[2])) {
                            carnivore.eatMeat();
                        }
                    }
                }
            } else if (input.contains(commands.get(3))) {
                if (splittedInput.length == 2) {
                    performers.forEach(Performer::performTrick);
                } else {
                    for (Performer performer : performers) {
                        performer.performTrick();
                    }
                }
            }else if(input.contains(commands.get(4))){
                loop = false;
                System.out.println("Program ending...");
            }
            else {
                System.out.println("Unknown command: " + input);
            }
        }
    }

}
