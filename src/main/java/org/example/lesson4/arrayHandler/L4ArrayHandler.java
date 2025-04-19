package org.example.lesson4.arrayHandler;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.Arrays;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public class L4ArrayHandler<C> {
    ArrayList <C> arrayList;

    public void replace(C[] forReplace, int firstIndex, int secondIndex){
        C elem = forReplace[firstIndex];
        forReplace[firstIndex] = forReplace[secondIndex];
        forReplace[secondIndex] = elem;
    }

    public ArrayList<C> toArrayList(C[] array){
        arrayList.addAll(Arrays.asList(array));
        return arrayList;
    }
}
