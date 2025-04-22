package org.example.lesson5.phoneBook;

import lombok.AllArgsConstructor;

import java.util.ArrayList;
import java.util.HashMap;

@AllArgsConstructor
public class PhoneBook {
    HashMap<String, ArrayList<String>> book;

    public void add(String phone, String name) {
        if (book.containsKey(name)) {
           book.get(name).add(phone); //ключ уже есть, просто добавляем в список номеров новый
        } else {
            ArrayList<String> arr =  new ArrayList<>();
            arr.add(phone);
            book.put(name, arr);
        }
    }

    public ArrayList<String> get(String key) {
        return book.get(key);
    }
}
