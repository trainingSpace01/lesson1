package org.example.lesson4.Boxes;

import lombok.AllArgsConstructor;
import org.example.lesson4.Fruits.Fruit;

import java.util.ArrayList;

@AllArgsConstructor
public class Box<T extends Fruit> {
    private ArrayList<T> fruits;

    public void put(T fruit){
        fruits.add(fruit);
    }

    public double getBoxWeight(){
        if (!fruits.isEmpty())
            return fruits.size() * fruits.getFirst().getWeight();
        else return 0;
    }

    public boolean compare (Box<?> box) {
        return this.getBoxWeight() == box.getBoxWeight();
    }

    public void load(Box<T> box) {
        this.fruits.addAll(box.fruits);
        box.fruits.clear();
    }
}
