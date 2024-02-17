package teme.temac7;

public class Challenge8 {
    public static void main(String[] args) {
        //8. Write a Java program to calculate the factorial of a number using a for loop.
        // Declare an integer variable number and assign a value to it. Then calculate and print the factorial of number.
        int sideOne = 6;

        int f = 1;
        for (int i = 1; i <= sideOne; i++) {
            f *= i;

        }
        System.out.println(f);
    }
}


