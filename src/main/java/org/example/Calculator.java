package org.example;

public class Calculator {


    // state
    private int result;

    //command
    public void add(int a , int b)
    {
        result+=a+b;
    }

    // query
    public int getResult() {
        return result;
    }


}
