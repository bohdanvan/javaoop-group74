package com.bvan.oop.lessons5_6.exception.account;

/**
 * @author bvanchuhov
 */
public interface Account {

    void withdraw(long money) throws AccountException;
}
