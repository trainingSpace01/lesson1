package org.example.lesson3.arrayHandlers;

import lombok.AllArgsConstructor;
import org.example.lesson3.exceptions.MyArrayDataException;
import org.example.lesson3.exceptions.MyArraySizeException;

@AllArgsConstructor
public class ArrayHandler {
    int arraySize;

    public int summ(String[][] array) {
        int summ = 0;
        checkArr(array.length);
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                checkArr(array[i].length);
                try {
                    summ += Integer.parseInt(array[i][j]);
                } catch (RuntimeException e){
                    throw new MyArrayDataException("Wrong data at row " + i + " column " +j);
                }
            }
        }
        return summ;
    }

    void checkArr(int size){
        if (size != arraySize)
            throw new MyArraySizeException("Size must be 4");
    }
}
