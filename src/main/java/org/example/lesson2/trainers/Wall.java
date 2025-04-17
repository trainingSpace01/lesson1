package org.example.lesson2.trainers;

import lombok.Getter;

@Getter
public class Wall extends Trainer {
    int height;

    public Wall(int checkingParam) {
        super(checkingParam);
        this.height = checkingParam;
    }
}
