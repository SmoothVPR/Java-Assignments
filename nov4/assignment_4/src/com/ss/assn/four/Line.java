package com.ss.assn.four;

import static java.lang.Math.abs;
import static java.lang.Math.sqrt;

public class Line
{
    double x0, y0, x1, y1;

    public Line(double x0, double y0, double x1, double y1)
    {
        this.x0 = x0;
        this.y0 = y0;
        this.x1 = x1;
        this.y1 = y1;
    }

    public double getSlope()
    {
        if (x1 == x0)
        {
            throw new ArithmeticException();
        }
        else
        {
            return (y1 - y0) / (x1 - x0);
        }
    }

    public double getDistance()
    {
        return sqrt( ((x1 - x0) * (x1 - x0)) + ((y1 - y0) * (y1 - y0)) );
    }

    public boolean parallelTo(Line line)
    {
        if (abs(getSlope() - line.getSlope()) < 0.0001)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
