package org.example.animals;

import lombok.AllArgsConstructor;
import lombok.experimental.SuperBuilder;

public class Fish extends Animal{

    public Fish(String name, int age) {
        super(name, age);
    }

    @Override
    public void voice(int a) {
        System.out.println("Ббвлалвлвлв");
    }

    @Override
    public void run(int distance) {
        System.out.println("Лапок нет братан, бегит не умею");
    }

    @Override
    public void swim(int distance) {
        System.out.println(this.name + " проплыл " + distance + "м");
    }

    @Override
    public String toString(){
        System.out.println(name + " " + age);
        return "";
    }
}
