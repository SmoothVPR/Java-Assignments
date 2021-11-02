package com.ss;

abstract class Shape
{
    public Shape()
    {
        System.out.println("Shape created");
    }

    abstract double calculateArea();
    abstract void display();
}
