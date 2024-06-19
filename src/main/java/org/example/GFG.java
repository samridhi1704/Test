package org.example;

import static java.lang.String.valueOf;

public class GFG {


    public String print(){

        String s = "Hello";
        return s;
    }

    public int autoBoxing()
    {

        int a = 5;
        Integer a1 = a;
        return a1;
    }

    public int unBoxing() {
        Integer a1 = 5;
        int a2 = a1;
        if (a2 == a1) {
            return a2;
        }
        return a2;
    }


    public String[] enhancedforLoop()
    {
        String array[] ={"H","B"};
        for(String x : array)
        {

        }
            return array;

    }
}
