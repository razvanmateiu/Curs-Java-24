package teme.temac8;

import java.util.Scanner;

public class Tema1 {
    public static void main(String[] args) {
//   Create a simple program that takes a number as input and uses if-else statements to categorize
//   the number as "positive," "negative," or "zero."
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduceti numar: ");
        int nr = scanner.nextInt();
        if (nr == 0) System.out.println("Numarul este 0");
        else if (nr > 0) System.out.println("Numarul este positiv");
        else System.out.println("Numarul este negativ");
    }
}
