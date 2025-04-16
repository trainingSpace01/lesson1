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

        for (int i = 0; i < animalList.size(); i++){
            animalList.get(i).run((int) (Math.random() * 100));
            animalList.get(i).swim((int) (Math.random() * 100));
        }
    }
}