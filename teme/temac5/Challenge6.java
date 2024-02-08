package teme.temac5;

import java.util.Scanner;

public class Challenge6 {
    public static void main(String[] argh) {
//Write a Java program that takes two numbers from the user and uses relational
//operators to display whether the first number is greater than, less than, or equal to the second number.
        Scanner ns = new Scanner(System.in);
        System.out.print("Introduceti primul numar (x): ");
        int x = ns.nextInt();
        System.out.print("Introduceti al doilea numar (y): ");
        int y = ns.nextInt();
        if (x == y) {
            System.out.println("Numerele " + x + " si " + y + " sunt egale");
        } else {
            if (x < y) {
                System.out.println("Numarul "+x+" este mai mic decat "+y);
            }
            else {
                System.out.println("Numarul "+x+" este mai mare decat "+y);
            }

        }
    }
}