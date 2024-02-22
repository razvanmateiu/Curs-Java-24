package teme.temac8;

import java.util.Scanner;

public class Challenge1 {
    public static void main(String[] args) {

//      1.Write a Java program that takes an integer as input. If the number is even, print "Even". If it's odd, print "Odd".

        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduceti numar: ");
        int nr = scanner.nextInt();
        if (nr % 2 == 0) System.out.println("Numarul este par");
        else System.out.println("Numarul este impar");
    }
}
