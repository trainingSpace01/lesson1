package org.example.lesson3.exceptions;

import lombok.Getter;

@Getter
public class MyArrayDataException extends RuntimeException {
    public MyArrayDataException(String message) {
        super(message);
    }
}
