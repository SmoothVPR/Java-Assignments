package com.ss.assn.one;

public class Singleton
{
    private static Singleton single_instance = null;
 
    // Private ctor further emphasizes Singleton nature
    private Singleton()
    {
        System.out.println("New Singleton created.");
    }
 
    public static Singleton getInstance()
    {
        if (single_instance == null)
            single_instance = new Singleton();
 
        return single_instance;
    }
}
