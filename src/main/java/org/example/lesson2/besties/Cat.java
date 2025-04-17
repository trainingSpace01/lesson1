package org.example.lesson2.besties;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.example.lesson2.interfaces.Jumpable;
import org.example.lesson2.interfaces.Runnable;

@AllArgsConstructor
@Getter
public class Cat implements Runnable, Jumpable {
    static int maxDist = 400;
    static int maxHeight = 1;
    String name;
    int age;
    boolean succesChecker;

    @Override
    public void jump(int height) {
        if (height > maxHeight) {
            System.out.println("Слишком высоко для кошачьих");
            this.succesChecker = false;
        } else {
            this.succesChecker = true;
            System.out.println("Кот " + name + " успешно преодолел препятствие");
        }
    }

    @Override
    public void run(int distance) {
        if (distance > maxDist) {
            System.out.println("Слишком далеко для кошачьих");
            this.succesChecker = false;
        } else {
            this.succesChecker = true;
            System.out.println("Кот " + name + " успешно справился с забегом");
        }
    }
}
