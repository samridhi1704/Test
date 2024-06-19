package org.example;

import org.example.exception.ArrayProcessingException;
import org.example.exception.NumberNotPresent;

public class OverLoading {

    public int sum(int a , int b) throws NumberNotPresent {
        if(a<0 || b < 0)
            throw new NumberNotPresent();
        return a+b;
    }

    public int  sum(int a , int b , int c) throws NumberNotPresent {
        if(a < 0 || b<0 || c<0)
            throw new NumberNotPresent();
        return a+b+c;
    }

    public int[] listt() throws ArrayProcessingException {
        int num[] = new int[3];
        int arrayList[] = {2,4,5};
        if(arrayList.length > num.length)
            throw new ArrayProcessingException();
        for(int i=0;i< arrayList.length;i++)
        {
            num[i]+=arrayList[i];

        }
        return num;

    }

    public String lisq(){

        String name = "Samridhi";
        System.out.println(name);

        return name;
    }
}
