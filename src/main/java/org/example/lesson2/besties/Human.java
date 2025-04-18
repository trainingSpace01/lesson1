package org.example.lesson2.besties;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.example.lesson2.interfaces.Bestie;

@AllArgsConstructor
@Getter
public class Human implements Bestie {
    static int maxDist = 1000;
    static int maxHeight = 4;
    String name;
    int age;
    boolean succesChecker;

    @Override
    public boolean jump(int height) {
        if (height > maxHeight) {
            System.out.println("Слишком высоко для человека");
            this.succesChecker = false;
        } else {
            this.succesChecker = true;
            System.out.println("Человек успешно преодолел препятствие");
        }
        return succesChecker;
    }

    @Override
    public boolean run(int distance) {
        if (distance > maxDist) {
            System.out.println("Слишком далеко для человека");
            this.succesChecker = false;
        } else {
            this.succesChecker = true;
            System.out.println("Человек успешно справился с забегом");
        }
        return succesChecker;
    }
}
