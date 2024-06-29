package org.example;

import java.util.Arrays;

import static java.lang.String.valueOf;

public class GFG {


    private int balance;

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
        int newArray[] = {10,20,30,23};
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

    public void aa()
    {
        for(Integer i=0;i<=50;i++)
            System.out.println(i);
    }

    public int noOfOnes()
    {

      int[] arr = new int[5];
      arr[0] = 1;
      arr[1] =0;
      arr[2] =1;
      arr[3] =0;
      arr[4] =1;

//      int no =0;
//        int n = arr.length;
//        int i=0;
//      while( i < n )
//      {
//          if(arr[i] ==1)
//              no++;
//          i++;
//      }

        int no = 0;
        int i = 0;
        if (arr.length > 0) {
            do {
                if (arr[i] == 1) {
                    no++;
                }
                i++;
            } while (i < arr.length);
        }



//      for(int i=0;i<arr.length;i++)
//      {
//          if(arr[i]==1)
//              no++;
//      }
      return no;

    }

// Encapsulation through public behaviour and private state
    public int deposit(int amount)
    {
        balance+=amount;
        return balance;
    }


    }

