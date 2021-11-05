package com.ss.assn.one;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import org.junit.Test;
import java.util.ArrayList;

public class UtilsTest
{
    ArrayList<String> original = new ArrayList<String>();
    ArrayList<String> target   = new ArrayList<String>();


    @Test
    public void sortTest()
    {
        original.add("i");
        original.add("see");
        original.add("trees");
        original.add("of");
        original.add("green");
        original.add("red");
        original.add("roses");
        original.add("too");
        original.add("i");
        original.add("see");
        original.add("them");
        original.add("bloom");
        original.add("for");
        original.add("me");
        original.add("and");
        original.add("you");

        target.add("green");
        target.add("me");
        target.add("see");
        target.add("see");
        target.add("trees");
        target.add("red");
        target.add("roses");
        target.add("and");
        target.add("bloom");
        target.add("for");
        target.add("i");
        target.add("i");
        target.add("of");
        target.add("them");
        target.add("too");
        target.add("you");

        original.sort((a, b) -> Utils.sort(a, b));
        int j = 0;
        for ( String x : original )
        {
            System.out.println(x + " : " + target.get(j));
            j++;
        }
        for (int i = 0; i < original.size(); i++)
        {
            assertTrue(original.get(0).compareTo(target.get(0)) == 0);
        }
    }
}
