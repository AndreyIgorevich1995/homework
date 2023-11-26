package com.jetpack.trc.model.exception;

public class StudentMenuException extends RuntimeException{
    public StudentMenuException(int text) {
        super("Надо было ввести 1, 2 или 3. Было введено : " + text);
    }
}
