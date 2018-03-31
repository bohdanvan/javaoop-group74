package com.bvan.oop.lessons7_8.generic.formatter;

/**
 * @author bvanchuhov
 */
public interface Formatter<T> {
    String format(T value);
}
