package com.ss.assn.two;

public class Singleton
{
    private static volatile Singleton single_instance = null;
 
    // Private ctor further emphasizes Singleton nature
    private Singleton()
    {
        System.out.println("New Singleton created.");
    }
 
    public static synchronized Singleton getInstance()
    {
        if (single_instance == null)
            single_instance = new Singleton();
 
        return single_instance;
    }
}
