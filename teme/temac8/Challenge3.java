package teme.temac8;

public class Challenge3 {
    public static void main(String[] args) {
//        Given an array of integers, write a program to count and print the number of negative integers in the array.

        int[] a = {12, -4, 23, -9, -1, 0, -2};
        int c = 0;


        for (int i = 0; i < 7; ++i) {
            if (a[i] < 0) ++c;
        }
        System.out.println("Numere negative: " + c);
    }
}
