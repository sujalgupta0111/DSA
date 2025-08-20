package com.array_merger_demerger;
import java.util.Arrays;

public class array_merger2 {
    public static void main(String[] args) {
        // Example arrays to merge
        int[] array1 = {1, 2, 3};
        int[] array2 = {4, 5, 6};

        // Create a new array with the size of both arrays combined
        int[] mergedArray = new int[array1.length + array2.length];

        // Copy elements from the first array
        System.arraycopy(array1, 0, mergedArray, 0, array1.length);

        // Copy elements from the second array
        System.arraycopy(array2, 0, mergedArray, array1.length, array2.length);

        // Print the merged array
        System.out.println("Merged Array: " + Arrays.toString(mergedArray));
    }
}
