package teme.temac11;

import java.util.Scanner;

public class Challenge2S06 {
    public static void main(String[] args) {
//        2. Palindrome Checker
//        Description: Write a program that checks whether a given string is a palindrome using the StringBuilder class.
//        A palindrome is a word, phrase, number, or other sequences of characters that reads the same forward and backward.
        System.out.print("Introduceti un cuvant: ");
        Scanner scanner = new Scanner(System.in);
        String cuvant = scanner.next();

        StringBuffer var=new StringBuffer();
        var.append(cuvant);
        String pali=var.reverse().toString();

        System.out.println(cuvant);
        System.out.println(pali);

        if (cuvant.equalsIgnoreCase(pali)) System.out.println("Este un palindrom");
    }
}