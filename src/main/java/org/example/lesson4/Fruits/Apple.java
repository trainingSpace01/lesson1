package org.example.lesson4.Fruits;

import lombok.Getter;

@Getter
public class Apple extends Fruit{
    static double appleWeight = 1.2;

    public Apple(){
        this.weight = appleWeight;
    }
}
