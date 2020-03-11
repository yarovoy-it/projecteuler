package com.is.projecteuler.euler_19;

import java.time.DayOfWeek;
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

    private static final int BASE_YEAR = 1900;

    /**
     * Count day of week if it first day of month
     *
     * @param firstYear     year when starting to count days of week
     * @param latsYear      year when finish to count days of week
     * @param dayOfWeekEnum DayOfWeek enum from ava.time.DayOfWeek
     * @return amount day of week on first day of month
     */
    public static int countDayOfWeekFirstDayOfMonth(int firstYear, int latsYear, DayOfWeek dayOfWeekEnum) {
        if (firstYear > latsYear | firstYear < BASE_YEAR) {
            throw new IllegalArgumentException("wrong value");
        }
        int amountDayFirst = 0;
        int dayOfWeek = 0;
        int month = 1;
        while (firstYear < latsYear) {
            Map<Integer, Integer> monthWithDay = getMapMonthDays(firstYear);
            for (int dayOfMonth = 1; dayOfMonth <= monthWithDay.get(month); dayOfMonth++) {
                dayOfWeek++;
                if (dayOfWeek == dayOfWeekEnum.getValue() && dayOfMonth == 1 && BASE_YEAR <= firstYear) {
                    amountDayFirst++;
                }
                if (dayOfWeek == dayOfWeekEnum.getValue()) {
                    dayOfWeek = 0;
                }
            }
            if (month < 12) {
                month++;
            } else {
                month = 1;
                firstYear++;
            }
        }
        return amountDayFirst;
    }

    /**
     * define year of leap or not
     *
     * @param year year for check
     * @return isLeap
     */
    private static boolean isLeap(int year) {
        return (year % 4 == 0 & year % 100 != 0);
    }

    /**
     * Return map of mouth where key is number of mouth value amount days
     *
     * @param year for filling up
     * @return map of month and days
     */
    private static Map<Integer, Integer> getMapMonthDays(int year) {
        Map<Integer, Integer> monthDays = new HashMap<>();
        monthDays.put(1, 31);
        monthDays.put(2, isLeap(year) ? 29 : 28);
        monthDays.put(3, 31);
        monthDays.put(4, 30);
        monthDays.put(5, 31);
        monthDays.put(6, 30);
        monthDays.put(7, 31);
        monthDays.put(8, 31);
        monthDays.put(9, 30);
        monthDays.put(10, 31);
        monthDays.put(11, 30);
        monthDays.put(12, 31);
        return monthDays;
    }

}
