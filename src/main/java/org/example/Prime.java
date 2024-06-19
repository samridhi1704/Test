package org.example;

public class Prime {

    public boolean primee(int n)
    {
            if(n <= 1)
                return false;
            for (int i=2;i <=Math.sqrt(n);i++)
        {
            if(n%2==0)
                return false;
        }
            return true;
    }
}
