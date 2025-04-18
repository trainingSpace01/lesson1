package org.example.lesson2;

import org.example.lesson2.besties.Cat;
import org.example.lesson2.besties.Human;
import org.example.lesson2.besties.Robot;
import org.example.lesson2.interfaces.Bestie;
import org.example.lesson2.trainers.Trainer;
import org.example.lesson2.trainers.Treadmill;
import org.example.lesson2.trainers.Wall;

import java.util.ArrayList;

public class L2Main {
    public static void main(String[] args) {
        ArrayList<Bestie> besties = new ArrayList<>();
        ArrayList<Trainer> trainers = new ArrayList<>();

        besties.add(new Human("Jack", 25, false));
        besties.add(new Cat("Barsik", 3, false));
        besties.add(new Robot("X99K15", 15, false));

        trainers.add(new Wall((int) (Math.random() * 5)));
        trainers.add(new Wall((int) (Math.random() * 10)));
        trainers.add(new Treadmill((int) (Math.random() * 100)));
        trainers.add(new Treadmill( (int) (Math.random() * 100)));

        for (Bestie o: besties) {
            for (Trainer t: trainers) {
                if (!t.contest(o, t.getCheckingParam()))
                    break;
            }
        }
    }
}
