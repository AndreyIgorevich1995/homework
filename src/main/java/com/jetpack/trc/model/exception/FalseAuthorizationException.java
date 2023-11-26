package com.jetpack.trc.model.exception;

public class FalseAuthorizationException extends RuntimeException{
    public FalseAuthorizationException(int text) {
        super("Надо было ввести 1, 2, 3 или 4. Было введено : " + text);
    }
}
