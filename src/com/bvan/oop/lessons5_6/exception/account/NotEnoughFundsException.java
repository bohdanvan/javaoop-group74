package com.bvan.oop.lessons5_6.exception.account;

/**
 * @author bvanchuhov
 */
public class NotEnoughFundsException extends AccountException {

    public NotEnoughFundsException(String message) {
        super(message);
    }

    public NotEnoughFundsException(String message, Throwable cause) {
        super(message, cause);
    }
}
