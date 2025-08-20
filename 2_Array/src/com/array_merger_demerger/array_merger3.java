package com.array_merger_demerger;
import java.util.Arrays;
import java.util.stream.IntStream;

public class array_merger3 {

    public static void main(String[] args) {

        int a[] = {10, 20, 30};
        int b[] = {40, 50, 60, 70, 80};

        // Merging arrays using Java Streams
        int[] c = mergeArraysUsingStreams(a, b);
        
          System.out.println("" + Arrays.toString(c));
    }

    public static int[] mergeArraysUsingStreams(int[] arr1, int[] arr2) {
        return IntStream.concat(Arrays.stream(arr1), Arrays.stream(arr2)).toArray();
    }
}