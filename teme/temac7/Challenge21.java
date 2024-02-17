package teme.temac7;

import java.util.Scanner;

public class Challenge21 {
    public static void main(String[] args) {
        //21. Write a Java program that takes a double variable score representing a student’s score on a test.
        // Use a ternary operator to classify the score into letter grades A, B, C, D, or F according to the following scale:
        //
        //A: 90-100
        //B: 80-89
        //C: 70-79
        //D: 60-69
        //F: 0-59
        Scanner n = new Scanner(System.in);
        System.out.print("Grade: ");
        int grade = n.nextInt();
        boolean x = false;
        x = (grade <= 59) ? true : false;
        if (x) System.out.println("F");

        x = (59 < grade && grade <= 69) ? true : false;
        if (x) System.out.println("D");

        x = (69 < grade && grade <= 79) ? true : false;
        if (x) System.out.println("C");

        x = (79 < grade && grade <= 89) ? true : false;
        if (x) System.out.println("B");

        x = (89 < grade && grade <= 100) ? true : false;
        if (x) System.out.println("A");


    }
}
