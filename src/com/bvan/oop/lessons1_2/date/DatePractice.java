package com.bvan.oop.lessons1_2.date;

import java.time.DayOfWeek;
import java.time.LocalDate;

/**
 * @author bvanchuhov
 */
public class DatePractice {

    public static void main(String[] args) {
        LocalDate localDate = LocalDate.now();
        System.out.println(localDate);

        String travoltaBirthDateStr = "1954-02-18";
        LocalDate birthDate =
                LocalDate.parse(travoltaBirthDateStr);

        DayOfWeek dayOfWeek = birthDate.getDayOfWeek();
        System.out.println(dayOfWeek.name());
        System.out.println(dayOfWeek.getValue());

        // ----
        System.out.println(LocalDate.now()
                .minusYears(10)
                .getDayOfWeek()
        );
    }
}
