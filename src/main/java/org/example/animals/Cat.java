package org.example.animals;

import lombok.AllArgsConstructor;
import lombok.experimental.SuperBuilder;


public class Cat extends Animal{

    public Cat(String name, int age) {
        super(name, age);
    }

    @Override
    public void voice(int a) {
        System.out.println("Мяв");
    }

    @Override
    public void run(int distance) {
        if (distance <= 200 && distance >= 0) {
            System.out.println(this.name + " пробежал " + distance);
        } else {
            System.out.println("Слишком далеко");
        }
    }

    @Override
    public void swim(int distance) {
        System.out.println("Эу братан, кошки не плавыают");
    }

    @Override
    public String toString(){
        System.out.println(name + " " + age);
        return "";
    }
}
