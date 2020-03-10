package com.is.projecteuler.euler_19;

import java.util.HashMap;
import java.util.Map;

/**
 * You are given the following information, but you may prefer to do some research for yourself.
 * <p>
 * 1 Jan 1900 was a Monday.
 * Thirty days has September,
 * April, June and November.
 * All the rest have thirty-one,
 * Saving February alone,
 * Which has twenty-eight, rain or shine.
 * And on leap years, twenty-nine.
 * A leap year occurs on any year evenly divisible by 4, but not on a century unless it is divisible by 400.
 * How many Sundays fell on the first of the month during the twentieth century (1 Jan 1901 to 31 Dec 2000)?
 */
public class EulerCalendar {

    private static final String STARTING_DATE = "1 Jan 1901 was a Monday";

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

    public static int countSundaysFirstDayOfMonth(int startYear, int endYear) {
        int sundaysCount = 0;
        int dayOfWeak = 1;
        int daysOfMouth = 0;
        int month = 1;
        while (startYear <= endYear) {
            Map monthWithDay = storeMouthDay(startYear);
            for (int day = 1; day <= (Integer) monthWithDay.get(month); day++) {
                dayOfWeak++;
                if (day == dayOfWeak && day == 1) {
                    sundaysCount++;
                }
                if (dayOfWeak == 7) {
                    dayOfWeak -= 7;
                }
            }
            if (month <= 12) {
                month++;
            } else {
                startYear++;
            }
        }
        return sundaysCount;
    }

    public static int countAllSundaysByYear(int year) {
        int countSundays = 0;
        int restDays = 0;
        for (int yearCount = 1901; yearCount < year; yearCount++) {
            int days = getDaysOfYear(yearCount);
            restDays = days % 7;
            countSundays += (restDays + days) / 7;
        }
        return countSundays;
    }


    private static Map<Integer, Integer> storeMouthDay(int year) {
        Map<Integer, Integer> map = new HashMap<>();
        if (year % 4 == 0 & year % 100 != 0) {
            map.put(2, 29);
        } else {
            map.put(2, 28);
        }
        map.put(1, 31);
        map.put(3, 31);
        map.put(4, 30);
        map.put(5, 31);
        map.put(6, 30);
        map.put(7, 31);
        map.put(8, 31);
        map.put(9, 30);
        map.put(10, 31);
        map.put(11, 30);
        map.put(12, 31);
        return map;
    }

}
