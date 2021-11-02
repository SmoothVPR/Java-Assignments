package com.ss;

public class Square extends Shape
{
    private double width;

    public Square(double _width)
    {
        this.width = _width;
    }

    public double calculateArea()
    {
        return this.width * this.width;
    }

    public void display()
    {
        System.out.println("Square with area: " + calculateArea() + "\n");
    }
}
