package com.ss.assn.two;

/**
 * Author:   Malik R Booker
 * Created:  November 7, 2021
 * Modified: November 7, 2021
 *
 * Brief:
 *  Demonstrates ability to use DateTime objects effectively
**/

import java.time.Year;
import java.time.Month;
import java.time.YearMonth;
import java.time.LocalDate;
import java.time.DayOfWeek;
import java.time.temporal.TemporalAdjusters;

public class Main
{
    public static void main(String[] args)
    {
        // Utils.getYearMonths()
        int yyyy = 1996;
        System.out.println("Days in the months of " + yyyy + ":");
        for (Month mm : Month.values())
        {
            YearMonth ym = YearMonth.of(yyyy, mm);
            System.out.println(mm.name() +
                               ((mm.name() + ":").length() < 8 ? ":\t\t" : ":\t") +
                               ym.lengthOfMonth() + " days");
        }
        System.out.println("");

        // Utils.getMondaysOfMonth()
        int mm = 12;
        System.out.println("Dates of each Monday for the month of " + Month.of(mm).name());
        LocalDate date = Year.now()
                         .atMonth(mm)
                         .atDay(1)
                         .with(TemporalAdjusters.firstInMonth(DayOfWeek.MONDAY));

        Month monthIt = date.getMonth();
        while (monthIt.getValue() == mm)
        {
            System.out.println(date);
            date = date.with(TemporalAdjusters.next(DayOfWeek.MONDAY));

            monthIt = date.getMonth(); // Increment iterator
        }
        System.out.println("");

        // Utils.isSpooky()
        System.out.println("Day falls on Friday the 13th?");
        int spookyMonth = 12;
        int spookyDay = 5;
        LocalDate spookyDate = Year.now().atMonth(spookyMonth).atDay(spookyDay);
        System.out.println(Utils.isSpooky(spookyDate) ? "True" : "False");
    }
}
