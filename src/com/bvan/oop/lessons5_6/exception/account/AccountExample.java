package com.bvan.oop.lessons5_6.exception.account;

/**
 * @author bvanchuhov
 */
public class AccountExample {

    public static void f(Account account) throws AccountException {
        account.withdraw(1000);
    }
}
