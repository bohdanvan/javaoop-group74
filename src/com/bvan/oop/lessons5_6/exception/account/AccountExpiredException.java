package com.bvan.oop.lessons5_6.exception.account;

/**
 * @author bvanchuhov
 */
public class AccountExpiredException extends AccountException {

    public AccountExpiredException(String message) {
        super(message);
    }

    public AccountExpiredException(String message, Throwable cause) {
        super(message, cause);
    }
}
