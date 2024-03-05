package teme.temac12;

import java.util.Scanner;

public class Tema2C12 {
    public static void main(String[] args) {
//        Create a Java program that finds and prints the character at a given index(2) in a string.
        System.out.print("Introduceti un String: ");
        Scanner scanner = new Scanner(System.in);
        String cuvant = scanner.next();
        System.out.println(cuvant.charAt(2));
    }
}
