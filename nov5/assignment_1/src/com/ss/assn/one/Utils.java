package com.ss.assn.one;

public class Utils
{
    public static int sort(String a, String b)
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
    }
}
