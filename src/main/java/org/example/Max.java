package org.example;

public class Max {

    public int maximum() {

        int[] arr = {2,4,8};
        int max = arr[0];
        for(int i=1;i<arr.length;i++)
            if(arr[i]>max)
                max =arr[i];
            return max;
    }
}
