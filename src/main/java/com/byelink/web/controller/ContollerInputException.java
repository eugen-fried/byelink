package com.byelink.web.controller;

public class ContollerInputException extends RuntimeException {
    public ContollerInputException(String message, Exception cause, Object... args) {
        super(String.format(message, args), cause);
    }
}
