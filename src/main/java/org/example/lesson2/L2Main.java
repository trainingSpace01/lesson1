package org.example.lesson2;

import org.example.lesson2.besties.Cat;
import org.example.lesson2.besties.Human;
import org.example.lesson2.besties.Robot;
import org.example.lesson2.trainers.Trainer;
import org.example.lesson2.trainers.Treadmill;
import org.example.lesson2.trainers.Wall;

import java.util.ArrayList;

public class L2Main {
    public static void main(String[] args) {
        ArrayList<Object> besties = new ArrayList<>();
        ArrayList<Trainer> trainers = new ArrayList<Trainer>();

        besties.add(new Human("Jack", 25, false));
        besties.add(new Cat("Barsik", 3, false));
        besties.add(new Robot("X99K15", 15, false));

        trainers.add(new Wall((int) (Math.random() * 5)));
        trainers.add(new Wall((int) (Math.random() * 10)));
        trainers.add(new Treadmill((int) (Math.random() * 100)));
        trainers.add(new Treadmill( (int) (Math.random() * 100)));

        for (Object o: besties) {
            for (Trainer t: trainers) {
                if (!action(o, t))
                    break;
            }
        }
    }

    //костыльная функция, думаю - можно придумать что-то получше, затык со списком объектов разного типа
    public static boolean action(Object o, Trainer t){
        if (o instanceof Human) {
            if (t instanceof Wall){
                ((Human) o).jump(((Wall)t).getHeight());
                return ((Human) o).isSuccesChecker();
            } else {
                ((Human) o).run(((Treadmill)t).getDistance());
                return ((Human) o).isSuccesChecker();
            }
        } else if (o instanceof Cat) {
            if (t instanceof Wall){
                ((Cat) o).jump(((Wall)t).getHeight());
                return ((Cat) o).isSuccesChecker();
            } else {
                ((Cat) o).run(((Treadmill)t).getDistance());
                return ((Cat) o).isSuccesChecker();
            }
        } else {
            if (t instanceof Wall){
                ((Robot) o).jump(((Wall)t).getHeight());
                return ((Robot) o).isSuccesChecker();
            } else {
                ((Robot) o).run(((Treadmill)t).getDistance());
                return ((Robot) o).isSuccesChecker();
            }
        }
    }
}
