package com.ss.assn.four;

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
        List<String> arr = new ArrayList<String>(){{ add("ax");
                                                     add("bb");
                                                     add("xbxbxc");
                                                     add("cx"); }};

        System.out.println("Original:");
        arr.forEach(x -> System.out.print(x + " "));
        System.out.println("\n");

        System.out.println("Scalar multiple of 2:");
        Utils.removeAllX(arr).forEach(x -> System.out.print(x + " "));
        System.out.println("\n");
    }
}
