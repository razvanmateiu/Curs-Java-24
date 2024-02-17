package teme.temac7;

public class Challenge16 {
    public static void main(String[] args) {
        //16. Write a Java program where you use unary operators to perform a series of
        //transformations on an integer variable number initialized to 50.
        // First, negate number, then take the absolute value, and finally increment it by 1. Print the result at each step.

        int a = 50;
        System.out.println(a=-a);
        System.out.println(a=Math.abs(a));
        System.out.println(++a);
    }
}
