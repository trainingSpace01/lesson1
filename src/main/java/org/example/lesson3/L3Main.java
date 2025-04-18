package org.example.lesson3;

import org.example.lesson3.arrayHandlers.ArrayHandler;

public class L3Main {
    public static void main(String[] args) {
        ArrayHandler arr = new ArrayHandler(4);
        String[][] s = {{"9","3", "5", "7"},
                        {"8","3", "5", "7"},
                        {"8","3", "5", "7"},
                        {"8","3", "5", "7"}};
        System.out.println(arr.summ(s));
    }
}
