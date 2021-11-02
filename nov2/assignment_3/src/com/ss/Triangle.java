package com.ss;

public class Triangle extends Shape
{
    private double base;
    private double height;


    public Triangle(double _base, double _height)
    {
        this.base   = _base;
        this.height = _height;
    }

    public double calculateArea()
    {
        return this.base * this.height / 2;
    }

    public void display()
    {
        System.out.println("Triangle with area: " + calculateArea() + "\n");
    }
}
