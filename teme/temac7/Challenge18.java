package teme.temac7;

import java.util.Arrays;

public class Challenge18 {
    public static void main(String[] args) {
        //18. Write a Java program where you declare an integer array with 5 elements.
        // Use a for loop to initialize the array such that each element is equal to its index incremented by 1.
        // Then use another for loop to decrement each element by 1.
        // Print the array before and after the decrement operation using a for-each loop.

        int[] arr = new int[5];
        int i, z;

        for (i = 0; i < arr.length; ++i) {
            z = i;
            arr[i] = ++z;
        }
        System.out.println(Arrays.toString(arr));
        for (i = 0; i < arr.length; ++i) {
            arr[i] = --arr[i];
        }
        System.out.println(Arrays.toString(arr));

    }
}
