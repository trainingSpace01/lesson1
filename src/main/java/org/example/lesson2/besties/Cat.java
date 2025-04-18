package org.example.lesson2.besties;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.example.lesson2.interfaces.Bestie;

@AllArgsConstructor
@Getter
public class Cat implements Bestie {
    static int maxDist = 400;
    static int maxHeight = 1;
    String name;
    int age;
    boolean succesChecker;

    @Override
    public boolean jump(int height) {
        if (height > maxHeight) {
            System.out.println("Слишком высоко для кошачьих");
            this.succesChecker = false;
        } else {
            this.succesChecker = true;
            System.out.println("Кот " + name + " успешно преодолел препятствие");
        }
        return succesChecker;
    }

    @Override
    public boolean run(int distance) {
        if (distance > maxDist) {
            System.out.println("Слишком далеко для кошачьих");
            this.succesChecker = false;
        } else {
            this.succesChecker = true;
            System.out.println("Кот " + name + " успешно справился с забегом");
        }
        return succesChecker;
    }
}
