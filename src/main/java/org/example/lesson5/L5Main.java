package org.example.lesson5;

import org.example.lesson5.phoneBook.PhoneBook;

import java.util.*;

public class L5Main {
    public static void main(String[] args) {
        Set<String> unicWords = new HashSet<>();
        String[] s = {"a","b", "c", "d", "c", "c",};
        firtsTask(s, unicWords);

        PhoneBook phoneBook = new PhoneBook(new HashMap<>());
        phoneBook.add("1234", "Yan");
        phoneBook.add("456", "Yan");
        System.out.println(phoneBook.get("Yan"));
    }

    public static void firtsTask(String[] words, Set<String> hs){
        hs.addAll(Arrays.asList(words));
        System.out.println(hs);
        for (String h : hs) {
            int q = 0;
            for (String jter : words) {
                if (jter.equals(h))
                    q++;
            }
            System.out.println("array contains word " + h + " " + q + " times");
        }
    }
}
