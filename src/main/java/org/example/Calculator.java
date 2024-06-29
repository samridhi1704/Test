package org.example;

public class Calculator {


    // state
    private int result;

    //command // void method state changed
    public void add(int a , int b)
    {
        result+=a+b;
    }

    // query
    public int getResult() {
        return result;
    }


}
