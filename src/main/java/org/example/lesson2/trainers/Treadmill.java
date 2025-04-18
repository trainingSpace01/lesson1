package org.example.lesson2.trainers;

import lombok.Getter;
import org.example.lesson2.interfaces.Bestie;

@Getter
public class Treadmill extends Trainer {
    int distance;

    public Treadmill(int checkingParam) {
        super(checkingParam);
        this.distance = checkingParam;
    }

    @Override
    public boolean contest(Bestie bestie, int distance) {
        return bestie.run(distance);
    }
}
