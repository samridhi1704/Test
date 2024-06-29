package org.example.OCP;

public class Square implements Shape {

    @Override
    public double area(double length, double breadth)
    {

        return  3.14* length*breadth;
    }
}
