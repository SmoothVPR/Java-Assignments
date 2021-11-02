package com.ss;

import static java.lang.Math.PI;

public class Circle extends Shape
{
    private double radius;


    public Circle(double _radius)
    {
        this.radius = _radius;
    }

    public double calculateArea()
    {
        return PI * radius * radius;
    }

    public void display()
    {
        System.out.println("Circle with area: " + calculateArea() + "\n");
    }
}
