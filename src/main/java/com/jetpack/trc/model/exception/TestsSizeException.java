package com.jetpack.trc.model.exception;

public class TestsSizeException extends RuntimeException{
    public TestsSizeException() {
        super("Нет такого элемента в списке тестов");
    }
}
