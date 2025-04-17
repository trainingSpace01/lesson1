package org.example.lesson2.trainers;

import lombok.Getter;

@Getter
public class Treadmill extends Trainer {
    int distance;

    public Treadmill(int checkingParam) {
        super(checkingParam);
        this.distance = checkingParam;
    }
}
