package com.ss.assn.one;

/**
 * Author:   Malik R Booker
 * Created:  November 5, 2021
 * Modified: November 5, 2021
 *
 * Brief:
 *   Creates two line classes and compares the slopes as well as calculates
 *   the distance between the two lines.
**/

import java.util.ArrayList;

public class Main
{
    public static void main(String[] args)
    {
        // Initialize array list;
        ArrayList<String> strArray = new ArrayList<String>();
        strArray.add("A");
        strArray.add("list");
        strArray.add("of");
        strArray.add("varying");
        strArray.add("string");
        strArray.add("sizes");

        // Original for reference
        System.out.println("Original array:");
        for (String a : strArray)
        {
            System.out.println(a);
        }
        System.out.println("");

        // Sorted by length
        System.out.println("Sorted by length:");
        strArray.sort((a, b) -> (a.length() < b.length() ? -1 : (a.length() > b.length() ? 1 : 0)));
        for (String a : strArray)
        {
            System.out.println(a);
        }
        System.out.println("");

        // Sorted by reversed length
        System.out.println("Sorted by reversed length:");
        strArray.sort((a, b) -> (a.length() > b.length() ? -1 : (a.length() < b.length() ? 1 : 0)));
        for (String a : strArray)
        {
            System.out.println(a);
        }
        System.out.println("");

        // Alphabetically by the first character only
        System.out.println("Sorted by first character:");
        strArray.sort((a, b) -> (a.charAt(0) < b.charAt(0) ? -1 : (a.charAt(0) > b.charAt(0) ? 1 : 0)));
        for (String a : strArray)
        {
            System.out.println(a);
        }
        System.out.println("");

        // Sorted by presence of 'e', then alphabetically sorted
        System.out.println("Sorted by presence of 'e', then first character:");
        strArray.sort((a, b) -> 
        {
            if ((a.indexOf('e') >= 0) && !(b.indexOf('e') >= 0))
            {
                return -1;
            }
            else if (!(a.indexOf('e') >= 0) && (b.indexOf('e') >= 0))
            {
                return 1;
            }
            else
            {
                return 0;
            }
        });
        for (String a : strArray)
        {
            System.out.println(a);
        }
        System.out.println("");

        // Alphabetically by the first character only but with my own comparator
        System.out.println("Sorted by presence of 'e', then first character");
        System.out.println("using my own user-defined static method:");
        strArray.sort((a, b) -> Utils.sort(a, b));
        for (String a : strArray)
        {
            System.out.println(a);
        }
        System.out.println("");
    }
}
