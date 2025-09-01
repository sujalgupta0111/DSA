package com.array_merger_demerger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class array_merger4 {
 
    public static int[] mergeArraysUsingArrayList(int[] a,
                                                  int[] b)
    {
        
        // Create an ArrayList to store the merged
        // elements
        List<Integer> r = new ArrayList<>();

        // Iterate through a and add each element to
        // resultList
        for (int n : a) {
            r.add(n);
        }

        // Iterate through b and add each element to
        // resultList
        for (int n : b) {
            r.add(n);
        }

        // Convert the ArrayList to an array using
        // streams
        return r.stream()
          .mapToInt(Integer::intValue).toArray();
    }

    public static void main(String[] args)
    {

        int a[] = { 10, 20, 30 };
        int b[] = { 40, 50, 60, 70, 80 };
      
        int[] r1 = mergeArraysUsingArrayList(a, b);

          System.out.println("" + Arrays.toString(r1));
    }
}