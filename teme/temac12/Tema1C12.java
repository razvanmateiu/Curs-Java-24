package teme.temac12;

import java.util.Scanner;

public class Tema1C12 {
    public static void main(String[] args) {
//        Create a Java program to find and print the length of a given string.
        System.out.print("Introduceti un String: ");
        Scanner scanner = new Scanner(System.in);
        String cuvant = scanner.next();
        System.out.println("Stringul are o lungime de " + cuvant.length() + " caractere");
    }
}
