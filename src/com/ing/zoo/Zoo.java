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

        List<Animal> animals = Arrays.asList(
                new Lion("Alex"),
                new Hippo("Gloria"),
                new Pig("Rick"),
                new Tiger("Wally"),
                new Zebra("Marty"),
                new Giraffe("Melman"),
                new Monkey("Julian")
        );
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
                    for (Animal animal : animals) {
                        if (animal.getEatsLeaves()) {
                            animal.eatLeaves();
                        }
                    }
                } else {
                    for (Animal animal : animals) {
                        if (animal.getName().toLowerCase().equals(splittedInput[2])) {
                            if (animal.getEatsLeaves()) {
                                animal.eatLeaves();
                            } else {
                                System.out.println("This animal doesn't eat leaves");
                            }
                        }
                    }
                }
            } else if (input.contains(commands.get(2))) {
                if (splittedInput.length == 2) {
                    for (Animal animal : animals) {
                        if (animal.getEatsMeat()) {
                            animal.eatMeat();
                        }
                    }
                } else {
                    for (Animal animal : animals) {
                        if (animal.getName().toLowerCase().equals(splittedInput[2])) {
                            if (animal.getEatsMeat()) {
                                animal.eatMeat();
                            } else {
                                System.out.println("This animal doesn't eat meat");
                            }
                        }
                    }
                }
            } else if (input.contains(commands.get(3))) {
                if (splittedInput.length == 2) {
                    for (Animal animal : animals) {
                        if (animal.getDoesTricks()) {
                            animal.performTrick();
                        }
                    }
                } else {
                    for (Animal animal : animals) {
                        if (animal.getName().toLowerCase().equals(splittedInput[2])) {
                            if (animal.getDoesTricks()) {
                                animal.performTrick();
                            } else {
                                System.out.println("This animal doesn't perform tricks");
                            }
                        }
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
