package org.example.lesson2.trainers;

import lombok.Getter;
import org.example.lesson2.interfaces.Bestie;

@Getter
public class Wall extends Trainer {
    int height;

    public Wall(int checkingParam) {
        super(checkingParam);
        this.height = checkingParam;
    }

    @Override
    public boolean contest(Bestie bestie, int height) {
        return bestie.jump(height);
    }
}
