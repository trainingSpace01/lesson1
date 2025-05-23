package org.example.lesson2.besties;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.example.lesson2.interfaces.Bestie;

@AllArgsConstructor
@Getter
public class Robot implements Bestie {
    static int maxDist = 2000;
    static int maxHeight = 6;
    String name;
    int age;
    boolean succesChecker;

    @Override
    public boolean jump(int height) {
        if (height > maxHeight) {
            System.out.println("Конструкция не рассчитана на такую высоту, нужна новая поршневая");
            this.succesChecker = false;
        } else {
            this.succesChecker = true;
            System.out.println("Модель " + name + " успешно преодолела препятствие");
        }
        return succesChecker;
    }

    @Override
    public boolean run(int distance) {
        if (distance > maxDist) {
            System.out.println("Аккумулятор сел, требуется замена");
            this.succesChecker = false;
        } else {
            this.succesChecker = true;
            System.out.println("Модель " + name + " успешно справилась с забегом, попробуйте догнать, кожанные");
        }
        return succesChecker;
    }
}
