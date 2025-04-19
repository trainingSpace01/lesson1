package org.example.lesson4;

import org.example.lesson4.Boxes.Box;
import org.example.lesson4.Fruits.Apple;
import org.example.lesson4.Fruits.Orange;

import java.util.ArrayList;

public class L4Main {
    public static void main(String[] args) {
        Box<Orange> orangeBox1 = new Box<>(new ArrayList<>());
        orangeBox1.put(new Orange());
        orangeBox1.put(new Orange());
        orangeBox1.put(new Orange());
        orangeBox1.put(new Orange());
        orangeBox1.put(new Orange());

        Box<Orange> orangeBox2 = new Box<>(new ArrayList<>());
        orangeBox2.put(new Orange());
        orangeBox2.put(new Orange());
        orangeBox2.put(new Orange());

        Box<Apple> appleBox1 = new Box<>(new ArrayList<>());
        appleBox1.put(new Apple());
        appleBox1.put(new Apple());
        appleBox1.put(new Apple());

        Box<Apple> appleBox2 = new Box<>(new ArrayList<>());
        appleBox2.put(new Apple());
        appleBox2.put(new Apple());
        appleBox2.put(new Apple());

        System.out.println(appleBox1.compare(appleBox2));

        orangeBox2.load(orangeBox1);
        System.out.println(orangeBox2.getBoxWeight());
        System.out.println(orangeBox1.getBoxWeight());

        /* первые два пункта задания
        String[] s = {"9","3", "5", "7"};
        ArrayList<String> castedToList;
        L4ArrayHandler<String> arrayHandler = new L4ArrayHandler<>(new ArrayList<>());
        arrayHandler.replace(s, 2, 3);
        castedToList = arrayHandler.toArrayList(s);
        for (String elem : castedToList)
            System.out.println(elem); */
    }
}
