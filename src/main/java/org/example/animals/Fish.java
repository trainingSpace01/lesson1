package org.example.animals;

public class Fish extends Animal{
    public Fish(String name, int age){
        this.name = name;
        this.age = age;
    }

    @Override
    public void voice() {
        System.out.println("Ббвлалвлвлв");
    }

    @Override
    public void run(int distance) {
        System.out.println("Лапок нет братан, бегит не умею");
    }

    @Override
    public void swim(int distance) {
        System.out.println(this.name + " проплыл " + distance + "м");
    }

    @Override
    public String toString(){
        System.out.println(name + " " + age);
        return "";
    }
}
