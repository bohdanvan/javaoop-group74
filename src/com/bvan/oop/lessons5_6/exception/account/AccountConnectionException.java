package com.bvan.oop.lessons5_6.exception.account;

/**
 * @author bvanchuhov
 */
public class AccountConnectionException extends AccountException {

    public AccountConnectionException(String message) {
        super(message);
    }

    public AccountConnectionException(String message, Throwable cause) {
        super(message, cause);
    }
}
