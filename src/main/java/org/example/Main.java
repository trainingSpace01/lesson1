package org.example;

import org.example.animals.Animal;
import org.example.animals.Cat;
import org.example.animals.Dog;
import org.example.animals.Fish;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Animal> animalList = new ArrayList<Animal>();

        animalList.add(new Cat("Jordan", 5));
        animalList.add(new Dog("Jack", 9));
        animalList.add(new Fish("Flipper", 3));

        for (Animal animal : animalList) {
            animal.run((int) (Math.random() * 100));
            animal.swim((int) (Math.random() * 100));
            animal.voice(5);
        }
    }
}