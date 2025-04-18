package org.example.lesson2.trainers;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.example.lesson2.interfaces.Bestie;

@Getter
@AllArgsConstructor
public abstract class Trainer {
    int checkingParam;

    public abstract boolean contest(Bestie bestie, int param);
}

// в целом не особо нужен родительский класс, просто для тренировки сделал