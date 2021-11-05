package com.ss.assn.three;

/**
 * Author:   Malik R Booker
 * Created:  November 3, 2021
 * Modified: November 5, 2021
 *
 * Brief:
 *   Creates a process with one thread (the producer) that produces items  
 *   and another thread (the consumer) consumes items.
**/

public class Main
{
    // Global variables
    ArrayList<Item> itemList = new ArrayList<Item>();

    public static void main(String[] args)
    {
        // Create a deadlock between two threads
        Main obj = new Main();

        int inventory = new Integer[]{ 1, 1, 2, 3, 4, 5 };
        Store store = new Store(inventory);

        // Producer prod = new Producer();
        // prod.produce(inventory);

        // Consumer cons = new Consumer();
        // cons.consume(inventory);

    }
}
