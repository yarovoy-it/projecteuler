package com.is.projecteuler.euler_19;

import java.time.DayOfWeek;

import static com.is.projecteuler.euler_19.EulerCalendar.countDayOfWeekFirstDayOfMonth;

public class Runner {

    public static void main(String[] args) {

        System.out.println(countDayOfWeekFirstDayOfMonth(1901, 2000, DayOfWeek.SUNDAY));

    }
}
