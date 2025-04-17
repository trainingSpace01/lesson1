package org.example.animals;

import lombok.AllArgsConstructor;
import lombok.experimental.SuperBuilder;

public class Dog extends Animal{

    public Dog(String name, int age) {
        super(name, age);
    }

    @Override
    public void voice(int a) {
        System.out.println("Гав");
    }

    @Override
    public void run(int distance) {
        if (distance <= 500 && distance >= 0) {
            System.out.println(this.name + " пробежал " + distance + "м");
        } else {
            System.out.println("Слишком далеко");
        }
    }

    @Override
    public void swim(int distance) {
        if (distance <= 10 && distance >= 0) {
            System.out.println(this.name + " проплыл " + distance + "м");
        } else {
            System.out.println("Слишком далеко");
        }
    }

    @Override
    public String toString(){
        System.out.println(name + " " + age);
        return "";
    }
}
