package org.example.lesson4.Fruits;

import lombok.Getter;

@Getter
public class Orange extends Fruit{
    static double orangeWeight = 1.6;

    public Orange() {
        this.weight = orangeWeight;
    }
}
