package com.jetpack.trc.model.exception;

public class FalseStartException extends RuntimeException{
    public FalseStartException(int text) {
        super("Надо было ввести 1 или 2. Было введено : " + text);
    }
}
