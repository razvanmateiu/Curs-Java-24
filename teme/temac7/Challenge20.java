package teme.temac7;

import java.util.Scanner;

public class Challenge20 {
    public static void main(String[] args) {
        //20. Write a Java program that takes three integer variables a, b, and c as input.
        //Use nested ternary operators to find and print the largest number among the three.

        int a, b, c;
        Scanner input = new Scanner(System.in);
        System.out.print("a= ");
        a = input.nextInt();
        System.out.print("b= ");
        b = input.nextInt();
        System.out.print("c= ");
        c = input.nextInt();

        if (a > b && a > c) {
            System.out.println("Max=" + a);
        } else if (b > a && b > c) {
            System.out.println("Max=" + b);
        } else System.out.println("Max=" + c);


    }
}
