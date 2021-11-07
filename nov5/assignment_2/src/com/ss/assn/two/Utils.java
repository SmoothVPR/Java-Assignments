package com.ss.assn.two;

import java.time.LocalDate;
import static java.time.temporal.ChronoField.DAY_OF_MONTH;
import static java.time.temporal.ChronoField.DAY_OF_WEEK;

public class Utils
{
    public static boolean isSpooky(LocalDate dt)
    {
        return ( (dt.get(DAY_OF_MONTH) == 13) && (dt.get(DAY_OF_WEEK) == 5) );
    }
}
