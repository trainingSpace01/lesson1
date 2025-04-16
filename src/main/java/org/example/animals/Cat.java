package org.example.animals;

public class Cat extends Animal{

    public  Cat (String name, int age){
        this.name = name;
        this.age = age;
    }

    @Override
    public void voice() {
        System.out.println("Мяв");
    }

    @Override
    public void run(int distance) {
        if (distance <= 200 && distance >= 0) {
            System.out.println(this.name + " пробежал " + distance);
        } else {
            System.out.println("Слишком далеко");
        }
    }

  //  @Override
    public void swim(int distance) {
        System.out.println("Эу братан, кошки не плавыают");
    }

    @Override
    public String toString(){
        System.out.println(name + " " + age);
        return "";
    }
}
