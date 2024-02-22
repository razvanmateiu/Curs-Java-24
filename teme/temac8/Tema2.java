package teme.temac8;

import java.util.Scanner;

public class Tema2 {
    public static void main(String[] args) {
//        Create a program that takes a number as input and uses if statement to print
//        whether the number is "positive" or "non-positive".
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduceti numar: ");
        int nr = scanner.nextInt();
        if (nr > 0) System.out.println("Numarul este positiv");
        else System.out.println("Numarul este non positiv");

    }
}
