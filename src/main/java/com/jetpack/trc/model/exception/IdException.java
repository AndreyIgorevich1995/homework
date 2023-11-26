package com.jetpack.trc.model.exception;

public class IdException extends RuntimeException{
    public IdException() {
        super("Пользователь с таким ID отсутствует");
    }
}
