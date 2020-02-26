package com.is.projecteuler.euler_19;

public class EulerCalendar {

    private static final String STARTING_DATE = "1 Jan 1900 was a Monday";

    public static int getDaysOfYear(int year) {
        int monthOf30Days = 30 * 4;
        int monthOf31Days = 31 * 7;
        int february = 0;
        if (year % 4 == 0 & year % 100 != 0) {
            february = 29;
        } else {
            february = 28;
        }
        return monthOf30Days + monthOf31Days + february;
    }

}
