package teme.temac11;

import java.util.Scanner;

public class Challenge1S06 {
    public static void main(String[] args) {

//        1. Reverse a String
//        Description: Use the StringBuilder class to write a program that reverses an input string.
//        For example, the input "hello" should return "olleh".

        System.out.print("Introduceti un cuvant: ");
        Scanner scanner = new Scanner(System.in);
        String cuvant = scanner.next();
        StringBuilder str = new StringBuilder(cuvant);
        System.out.println(str.reverse());
    }
}
