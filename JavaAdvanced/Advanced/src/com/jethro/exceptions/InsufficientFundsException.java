package com.jethro.exceptions;
// checked ->  Exception class
// unchecked (runtime exception) -> Runtime Exception
public class InsufficientFundsException extends Exception {
    public InsufficientFundsException() {
        super("Insufficient funds in your account");
    }

    public InsufficientFundsException(String message) {
        super(message
        );
    }
}
