package teme.temac7;

public class Challenge5 {
    public static void main(String[] args) {
        //Write a Java program to print the numbers from 1 to 10 using a for loop.
        // As a next step, modify your program to print only the even numbers from 1 to 10.

        for (int i = 1; i < 11; i++) {

            System.out.println(i);
        }
        /** Doar nume pare */

        for (int i = 1; i < 11; i++) {
            if ((i % 2) == 0) {
                System.out.println(i);
            }
        }
    }
}
