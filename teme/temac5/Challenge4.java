package teme.temac5;

import java.util.Scanner;

public class Challenge4 {
    public static void main(String[] argh) {
// Write a Java program that uses both the increment (++) and decrement (--)
// operators in a loop to count up to 10 and then back down to 1.
        Scanner ns = new Scanner(System.in);
        System.out.print("Introduceti o valoare intre 0 si 10: ");
        int x = ns.nextInt();
        if (x < 0 || x > 10) {
            System.out.println("Valoarea introdusa nu este corecta!!");
        } else {
            System.out.println(x);
            while (x < 10) {
                x = ++x;
                System.out.println(x);
            }

        while (x > 0) {
            x = --x;
            System.out.println(x);
        }
        }
    }
}