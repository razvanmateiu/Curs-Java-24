package teme.temac5;

import java.util.Scanner;

public class Challenge7 {
    public static void main(String[] argh) {
//Write a program where you perform operations between
// an integer and a double. Display the result.
        Scanner ns = new Scanner(System.in);
        System.out.print("x(int)=  ");
        int x = ns.nextInt();
        System.out.print("y(double)= ");
        double y = ns.nextDouble();

        System.out.println("x+y= "+(x + y));
        System.out.println("x-y= "+(x - y));
        System.out.println("x*y= "+(x * y));
        System.out.println("x/y= "+(x / y));
        System.out.println("x%y= "+(x % y));
    }
}