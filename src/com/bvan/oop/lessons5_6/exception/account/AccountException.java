package com.bvan.oop.lessons5_6.exception.account;

/**
 * @author bvanchuhov
 */
public class AccountException extends Exception {

    public AccountException(String message) {
        super(message);
    }

    public AccountException(String message, Throwable cause) {
        super(message, cause);
    }
}
