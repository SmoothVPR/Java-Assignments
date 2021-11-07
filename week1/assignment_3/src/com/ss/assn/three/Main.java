package com.ss.assn.three;

/**
 * Author:   Malik R Booker
 * Created:  November 7, 2021
 * Modified: November 7, 2021
 *
 * Brief:
 *    Given a list of integers, return a list where each integer is multiplied by 2.
**/

import java.util.ArrayList;
import java.util.List;

public class Main
{
    public static void main(String[] args)
    {
        List<Integer> arr = new ArrayList<Integer>(){{ add(1);
                                                       add(22);
                                                       add(93);
                                                       add(16);
                                                       add(80); }};
        System.out.println("Original:");
        arr.forEach(x -> System.out.print(x + " "));
        System.out.println("\n");

        System.out.println("Scalar multiple of 2:");
        Utils.scalarMultiplyBy2(arr).forEach(x -> System.out.print(x + " "));
        System.out.println("\n");
    }
}
