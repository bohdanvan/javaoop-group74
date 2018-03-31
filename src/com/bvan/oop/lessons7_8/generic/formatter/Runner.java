package com.bvan.oop.lessons7_8.generic.formatter;

import com.bvan.oop.lessons5_6.format.Product;

import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 * @author bvanchuhov
 */
public class Runner {

    public static void main(String[] args) {
        Printer<Product> productPrinter;
        Printer<LocalDate> datePrinter = new Printer<>();

        datePrinter.add(LocalDate.of(2000, 4, 10));
        datePrinter.add(LocalDate.of(1996, 10, 17));

        Formatter<LocalDate> formatter = new YearFormatter();
        datePrinter.print(formatter);
    }
}

class YearFormatter implements Formatter<LocalDate> {

    @Override
    public String format(LocalDate value) {
        int year = value.getYear();
        return String.valueOf(year);
    }
}
