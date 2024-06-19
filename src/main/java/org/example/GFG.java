package org.example;

import java.util.Arrays;

import static java.lang.String.valueOf;

public class GFG {


    public String print(){

        String s = "Hello";
//        String concat = s.concat(" World");
//        return conact;
        return s.concat(" World");
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


    public int binarySearch()
    {
        int newArray[] = {10,30,23};
        Arrays.sort(newArray);
        int key = 30;
       int p= Arrays.binarySearch(newArray,key); //get the index position
       return p;

    }

    public int compareArray()
    {
        int newArray1[] = {2,4,5};
        int newArray2[] = {2,4,5};
        return Arrays.compare(newArray1,newArray2);

    }
}
