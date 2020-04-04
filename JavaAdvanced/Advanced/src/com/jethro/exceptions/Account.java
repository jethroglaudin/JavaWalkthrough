package com.jethro.exceptions;

import java.io.IOException;

public class Account {
    private float balance;

    public void deposit(float value) throws IOException {
        if (value <= 0 ) // defensive programming
//            throw new IllegalArgumentException();
            throw new IOException();
    }

    // Creating Generic Exception
    public void withdraw(float value) throws InsufficientFundsException {
        if (value > balance)
            throw new InsufficientFundsException();

    }
}
