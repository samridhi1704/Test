package org.example.OCP;

public class Rectangle implements Shape{

    @Override
    public double area(double length, double breadth)
    {
        return length*breadth;
    }


}
