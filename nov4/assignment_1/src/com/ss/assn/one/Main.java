package com.ss.assn.one;

/**
 * Author:   Malik R Booker
 * Created:  November 3, 2021
 * Modified: November 4, 2021
 *
 * Brief:
 *   Instantiates a set of Singleton instances { a, b, c }
 *   then prints their hash code to stdout
**/

public class Main
{
    public static void main(String[] args)
    {
        // Instantiating Singleton classes
        Singleton a = Singleton.getInstance();
        Singleton b = Singleton.getInstance();
        Singleton c = Singleton.getInstance();
 
        // Printing the hash code for each instance
        System.out.println("Hashcode of a: " + a.hashCode());
        System.out.println("Hashcode of b: " + b.hashCode());
        System.out.println("Hashcode of c: " + c.hashCode());
 
        // Condition check
        System.out.println("\nEach object points to " +
                          ((a == b && c == b) ? "the same" : "a different") +
                          " memory address on the heap.");
    }
}
